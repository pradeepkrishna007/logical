package sorting;

public class BubbleSort {
	
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
	public void bubbleSort(){
		for(int i=arrySize-1;i>1;i--){
			for(int j=0;j<i;j++){
				if(theArrary[j]>theArrary[j+1]){
					swapTheValue(j,j+1);
				}
			}
		}
		
	}
	private void swapTheValue(int firstIndex, int secodIndex) {
		int temp;
		temp=theArrary[secodIndex];
		theArrary[secodIndex]=theArrary[firstIndex];
		theArrary[firstIndex]=temp;
	}
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		bs.initializeArry();
		bs.printArray();
		bs.bubbleSort();
		System.out.println("=================================");
		bs.printArray();
	}

}
