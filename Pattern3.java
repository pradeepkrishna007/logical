/*=======================================================================	
Enter number of ROWS :5		
		*
		*	*
		*	*	*
		*	*	*	*
		*	*	*	*	*
======================================================================== */
import java.util.Scanner;
public class Pattern3{
public void printPattern(int num){
for(int rowIndex=1;rowIndex<=num;rowIndex++){
for(int colIndex=1;colIndex<=rowIndex;colIndex++)
System.out.print(" * ");
System.out.println();	
}//for
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of ROWS :");
int num=Integer.parseInt(sc.next());
Pattern3 p3=new Pattern3();
p3.printPattern(num);
}
};