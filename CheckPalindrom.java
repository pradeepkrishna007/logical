/* 
	file name: CheckPalindrom.java
	version		: 1.0v
	copyright by @pradeep kumar.
*/
import java.util.Scanner;

public class CheckPalindrom{
	/* Author: Pradeep Kumar
		*/
	public String reverse(String s){
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		String s1=new String(str);
		return s1;
		}//reverse
	public void checkPalindrom(int num){
		int countf=0;
		int countp=0;
		int num1=num;
		//System.out.println("sexy");
		String s=Integer.toString(num);
		if(s.equals(reverse(s)))
			System.out.println("\n"+num+" is a palindrom number");
		else
			System.out.println("\n"+num+" is not a palindrom number");
		System.out.print("\nAnd the nearest palindrom number is : ");
		
		for(int forward=0; ;forward++){
			num++;
			countf++;
			if((Integer.toString(num)).equals(reverse(Integer.toString(num))))
				break;
		}//forward for loop closed.

		for(int prev=0;num!=0;prev++){
			num1--;
			countp++;
			if((Integer.toString(num1)).equals(reverse(Integer.toString(num1))))
				break;
		}//prev for loop closed.

if(countf==countp)
	System.out.println(num1+" & "+num+" (Both has same distance)");
else if(countf<countp)
	System.out.println(num);
if(countf>countp)
	System.out.println(num1);
}//checkPalindrom method closed.

public static void main(String[] args) {
		/*Scanner class API used to read values from consol*/
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number  : ");
			int num=Integer.parseInt(sc.next());
		CheckPalindrom cp=new CheckPalindrom();
		cp.checkPalindrom(num);
}//main method closed
};//class clo9sed.