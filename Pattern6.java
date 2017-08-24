/*
                1
			1	2	1
		1 	2   3   2	1
	1	2	3	4	3	2	1
=============================================================================*/
import java.util.*;									
class Pattern6{
	public void printPattern(int num){
	int copyNum=num;
	for(int rowIndex=1;rowIndex<=num;rowIndex++){
		for(int spaceIndex=1;spaceIndex<copyNum;spaceIndex++){
		System.out.print(" ");
		}
		for(int colIndex=1;colIndex<=rowIndex;colIndex++){
		System.out.print(colIndex);
		if(colIndex==rowIndex)
		for(int halfIndex=colIndex;halfIndex>1;halfIndex--)
			System.out.print(halfIndex-1);
		}//col for
	System.out.println();
	copyNum--;
	}
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Eneter number :");
	int num=Integer.parseInt(sc.next());
	Pattern6 p6=new Pattern6();
	p6.printPattern(num);
 }
};	