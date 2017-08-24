class Customer{  
	int amount=10000;  

	synchronized void withdraw(int amount){  
		System.out.println("going to withdraw...");  

		if(this.amount<amount){  
			System.out.println("Less balance; "+this.amount+" than "+amount+" waiting for deposit...");  
			try{wait();}catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...balance left is "+this.amount);  
	}  

	synchronized void deposit(int amount){  
		System.out.println("going to deposit..."+amount);  
		this.amount+=amount;  
		System.out.println("deposit completed... total balance is "+this.amount);  
		notifyAll();
	}  
}  

class DeadLock{  
	public static void main(String args[]){  
		final Customer c=new Customer();  
		new Thread(){  
			public void run(){c.withdraw(15000);}  
		}.start();  
		new Thread(){  
			public void run(){c.deposit(10000);}  
		}.start();
		new Thread(){  
			public void run(){c.withdraw(15000);}  
		}.start();
		new Thread(){  
			public void run(){c.withdraw(15000);}  
		}.start();
		new Thread(){  
			public void run(){c.deposit(10000);}  
		}.start(); 
		new Thread(){  
			public void run(){c.deposit(10000);}  
		}.start(); 
	}}