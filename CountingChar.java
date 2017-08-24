/*Enter any String : tomorrow
o/p-	t=1
		o=3
		m=1
		r=2
		w=1		
*****************************************************************************/
import java.util.*;
public class CountingChar{
public void countCharInString(String str){
int fixedRow=0;
for(int moveIndx=fixedRow;moveIndx<str.length();moveIndx++){
int count=0;
boolean flag=true;
for(int checkIndx=fixedRow-1;checkIndx>=0;checkIndx--){
if(str.charAt(fixedRow)==str.charAt(checkIndx)){
flag=false;
}//if
}//for check 
if(flag){
for(int countIndx=fixedRow;countIndx<str.length();countIndx++){
if(str.charAt(fixedRow)==str.charAt(countIndx))
count++;
}System.out.println(str.charAt(fixedRow)+" = "+count);
}//if
fixedRow++;
}//for move
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Eneter any String :");
String str=sc.nextLine();
CountingChar ch=new CountingChar();
ch.countCharInString(str);
}
};	