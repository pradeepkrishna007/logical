
/* 
	file name : AdjMatrix.java
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

public class AdjMatrix{
	/* Author: Pradeep Kumar
		*/
	static int row,col;

/* findAdjElement method used to find  adj Elements 
*	of given array element values*/
	public static void findAdjElement(int [][]arr,int r,int c){
		if (r!=0){
		System.out.println("top Element is "+arr[r-1][c]);
		}else
			System.out.println("top Element doesn't exit ");

		if (c!=0){
		System.out.println("Left Element is "+arr[r][c-1]);
		}else
			System.out.println("Left Element doesn't exit ");

		if (r==row-1){
			System.out.println("Bottom Element doesn't exit ");
		}else
			System.out.println("Bottom Element is "+arr[r+1][c]);

		if (c==col-1){
			System.out.println("Right Element doesn't exit ");
		}else
			System.out.println("Right Element is "+arr[r][c+1]);
		    
}//findAdjElement

public static void main(String[] args) {
		/*Scanner class API used to read values from consol*/
		Scanner sc=new Scanner(System.in);
	/* Logic for taking input for xXx Matrix*/
		System.out.print("Enter number  row and col values for matrix : ");
			row=Integer.parseInt(sc.next());
			col=Integer.parseInt(sc.next());
			int [][] arr=new int[row][col];
			for (int rIndex=0;rIndex<row;rIndex++){
				for(int cIndex=0;cIndex<col;cIndex++){
					System.out.print("\nEnter the value of "+rIndex+"X"+cIndex+"value :");
					arr[rIndex][cIndex]=Integer.parseInt(sc.next());
				}
			}

		/* Logic for finding Adjusent element of given value*/
		System.out.print("Enter the values whose Adjusent you want to find : ");
		int num=Integer.parseInt(sc.next());
			int r,c;
			boolean flag=true;
			for (int rIndex=0;rIndex<row;rIndex++){
				for(int cIndex=0;cIndex<col;cIndex++){
					if (arr[rIndex][cIndex]==num){
					r=rIndex;
					c=cIndex;
					System.out.println("\nAdj Element for : "+rIndex+"X"+cIndex+" values : "+num);
					AdjMatrix.findAdjElement(arr,r,c);
					flag=false;
					}
				}//for cIndex closed
			}//for rIndex loop closed
		if (flag)
		System.out.println("Plz check the values you have entered: ");	
}//main method closed
};//class closed