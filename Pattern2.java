/*	Enter number of ROWS : 4
				a
			e	i	o
		u	a	e	i	o
	u	a	e	i	o	u	a   									
*******************************************************************/
import java.util.*;									
class Pattern2{
public void printPattern(int num){
int copyNum=num;
String str="aeiou";
for(int rowIndex=1,m=0;rowIndex<=num;rowIndex++){
	for(int spaceIndex=1;spaceIndex<copyNum;spaceIndex++){
	System.out.print(" ");
	}
	for(int colIndex=1;colIndex<=(rowIndex*2-1);colIndex++){
	if(m<str.length()){
	System.out.print(str.charAt(m));
	m++;}
	else{ m=0;colIndex--; }
	}
	System.out.println();
	copyNum--;
	}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Eneter number :");
int num=Integer.parseInt(sc.next());
Pattern2 p2=new Pattern2();
p2.printPattern(num);
}
};	