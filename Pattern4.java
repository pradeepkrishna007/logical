/*=======================================================================	
Enter number of ROWS :5		
					*
				*	*
			*	*	*
		*	*	*	*
	*	*	*	*	*
======================================================================== */
import java.util.Scanner;
public class Pattern4{
public void printPattern(int num){
int copyNum=num;
for(int rowIndex=1;rowIndex<=num;rowIndex++){
	for(int spaceIndex=1;spaceIndex<copyNum;spaceIndex++){
		System.out.print("   ");}
for(int colIndex=1;colIndex<=rowIndex;colIndex++)
System.out.print(" * ");
System.out.println();
copyNum--;
}//for close
}//printPattern close
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of ROWS :");
int num=Integer.parseInt(sc.next());
Pattern4 p4=new Pattern4();
p4.printPattern(num);
}
};