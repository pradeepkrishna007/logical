
/* 
	file name : Armstrong.java
	version	  : 1.0v
*	Author     : Pradeep Kumar
*
* Copyright (c) 2012-2013 Nacre Software Solution, Inc. All Rights Reserved.
*
* This software is the confidential and proprietary information of Nacre Software Services, Inc. 
* ("Confidential Information"). You shall not disclose such Confidential Information and 
* shall use it only in accordance with the terms of the license agreement you entered into
* with Nacre.
*
* NACRE MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
* THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
* TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
* PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
* ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
* DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
*/
import java.util.Scanner;

public class Armstrong{
	/* Author: Pradeep Kumar
		*/

		/* method for converting armstrong number */
	public int convert(int num){
			 int sum=0;
			 int r=0;
		for(int index=0;num!=0;index++){
			r=num%10;
			sum+=r*r*r;
			num=num/10;
			}
			return sum;
	}//convert

	public void checkArmstrong(int num){
		int countf=0;  //counter for forward direction 
		int countp=0; //counter for back direction 
		int num1=num;

		     System.out.println(convert(num));
		if(num==convert(num))
			System.out.println("\n"+num+" is a Armstrong number");
		else
			System.out.println("\n"+num+" is not a Armstrong number");
		System.out.print("\nAnd the nearest Armstrong number is : ");
		
	/* for loop for checking nearest Armstrong number in forward direction */
		for(int forward=0; ;forward++){
			num++;
			countf++;
			if(num==convert(num))
				break;
		}//forward for loop closed.

	/* for loop for checking nearest Armstrong number in forward direction */
		for(int prev=0;num1!=0;prev++){
			num1--;
			countp++;
			if(num1==convert(num1))
				break;
		}//prev for loop closed.

if(countf==countp)
	System.out.println(num1+" & "+num+" (Both has same distance)");
else if(countf<countp)
	System.out.println(num);
if(countf>countp)
	System.out.println(num1);
}//checkArmstrong method closed.

public static void main(String[] args) {
		/*Scanner class API used to read values from consol*/
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number  : ");
			int num=Integer.parseInt(sc.next());
		Armstrong arm=new Armstrong();
		arm.checkArmstrong(num);
}//main method closed
};