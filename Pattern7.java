/*		Enter number of ROWS :6
			1
			2	7
			3	8	12
			4	9	13	16
			5	10	14	17	19
			6	11	15	18	20	21
===============================================================================*/
import java.util.*;
public class Pattern7{

public void printPattern(int num){
int incr=num-1;
for(int rowIndex=1;rowIndex<=num;rowIndex++){
int count=0;
for(int colIndex=0;colIndex<rowIndex;colIndex++){
System.out.print(rowIndex+count+"  ");
count=count+incr-colIndex;
}//for colIndex.
System.out.println();	
}//for
}//printPattern closed.
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of ROWS :");
int num=Integer.parseInt(sc.next());
Pattern7 p7=new Pattern7();
p7.printPattern(num);
}
};