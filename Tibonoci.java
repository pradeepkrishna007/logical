/*=======================================================================	
Enter number of ROWS :7		

			0	1	1	2	4	7	13

===========================================================================*/
import java.util.Scanner;
public class Tibonoci{
public void printPattern(int num){
int dummy,second,first,value; 
second=1; first=0; value=0;
for(int rowIndex=1;rowIndex<=num;rowIndex++){
System.out.print(value+" "); 
 dummy=second; second=first; first=value; value=dummy+second+first;
}//for
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of ROWS :");
int num=Integer.parseInt(sc.next());
Tibonoci t=new Tibonoci();
t.printPattern(num);
}
};