import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixTest {


	public static void printGrid(int []a[],int sizeR,int sizeC)
	{
		for(int i = 0; i < sizeR; i++)
		{
			for(int j = 0; j < sizeC; j++)
			{
				System.out.printf("%5d ", a[i][j]);
			}
			System.out.println();
		}
	}
	private static void printArry(List<Integer> arr) {
		// TODO Auto-generated method stub
		int count=1;
		for(Integer i:arr){
			System.out.printf("%5d ",i);
			if(count % 10 ==0){System.out.println();}
			count++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter the matrix size RowxColumn:: ");
		int sizeR=scn.nextInt();
		int sizeC=scn.nextInt();
		List<Integer> arr=new ArrayList<Integer>();
		int []matrix[] = new int[sizeR][sizeC]; 
		for(int outIndex=0,i=1;outIndex<sizeR;outIndex++){
			for(int inIndex=0;inIndex<sizeC;inIndex++,i++){
				matrix[outIndex][inIndex]=i;
			}
		}
		printGrid(matrix,sizeR,sizeC);
		System.out.println("Logic start");
		int count=0;
		/*****************************************************/
		for (int i = 0; i < sizeR-count; i++,count++) {
			for (int k = i; k < (sizeC-count); k++) {
				arr.add(matrix[i][k]);
				if(k==(sizeC-1-count)){
					for (int j = (count+1); j < (sizeR-count); j++) {
						arr.add(matrix[j][k]);
						if(j==(sizeR-1-count)){
							for (int j2 =  (sizeC-2-count); j2 >= count; j2--) {
								arr.add(matrix[j][j2]);
								if(j2==count){//for going up
									for (int l = (sizeR-2-count); l > count ; l--) {
										arr.add(matrix[l][j2]);
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		printArry(arr);
	}

}


