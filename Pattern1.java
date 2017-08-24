/*	Enter number of ROWS :3
					1
				1	0	1
			1	0	1	0	1		
****************************************************************************/
import java.util.*;									
class Pattern1{
public void printPattern(int num){
int num1=num;
for(int i=1;i<=num;i++){
	for(int j=1;j<num1;j++){
	System.out.print(" ");
	}
	for(int j=1;j<=(i*2-1);j++){
	if(j%2!=0)
	System.out.print("1");
	else
	System.out.print("0");
	}
	System.out.println();
	num1--;
	}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Eneter number :");
int num=Integer.parseInt(sc.next());
Pattern1 p1=new Pattern1();
p1.printPattern(num);
}
};	
