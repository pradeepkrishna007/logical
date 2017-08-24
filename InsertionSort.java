package sorting;

public class InsertionSort {
	
	int [] theArrary = new int[50];
	int arrySize = 10;
	
	public void initializeArry(){
		for(int i=0;i<arrySize;i++){
			theArrary[i]=(int)(Math.random()*10)+10;
		}
	}
	public void printArray(){
		for(int i=0;i<arrySize;i++){
			System.out.println("| "+i+" | "+theArrary[i]+" |");
		}
	}
	
	public void insertionSort(){
		
		for(int i=1;i<arrySize;i++){
			int j=i;
			int temp=theArrary[i];
			
			while (j>0 && (theArrary[j-1]>temp)) {
				theArrary[j]=theArrary[j-1];
				j--;
			}
			theArrary[j] = temp;
			
		}
		
	}
	
	public static void main(String[] args) {
		InsertionSort is=new InsertionSort();
		is.initializeArry();
		is.printArray();
		is.insertionSort();
		System.out.println("======================================");
		is.printArray();
	}

}
