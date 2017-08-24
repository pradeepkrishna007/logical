/*===========================================================================
	Enter number of ROWS :5	
		* * * * * * * * * 
		* * * *   * * * *-----3
		* * *       * * *-----7==3*2+1
		* *           * *-----11=3*3+2
		*               *-----15=3*4+3
==============================================================================  */
import java.util.Scanner;
class Pattern5{
public void printPattern(int num){
int n=3,indexCount=1;
int space=num;
for(int rowIndex=1;rowIndex<=num;rowIndex++){
	for(int colIndex=0;colIndex<(num*2-1);colIndex++){
		if(rowIndex>1){
		if(colIndex==space){
		for(int spaceIndex=1;spaceIndex<(n*(rowIndex-1)+(rowIndex-1))-1;spaceIndex++)
		System.out.print(" ");
		for(int count=0;count<indexCount;count++)
		colIndex++;
		}//if space
		}//if codition close..
		System.out.print("* ");
	}//col for close
		System.out.println();
		space--;
		if(rowIndex>1){
		indexCount=indexCount+2;}
}//row for close
}//printPattern close
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of ROWS :");
int num=Integer.parseInt(sc.next());
Pattern5 p5=new Pattern5();
p5.printPattern(num);
}
};