
public class ReturnInWhile {
	
	static int callCheck(){
		int i=0;
		while(true){
		return i;
//		System.out.println("Pradeep");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= callCheck();
		System.out.println("print i "+i);
	}

}
