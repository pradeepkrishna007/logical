package com.logical.convertDecToBinary;

import java.util.Scanner;

public class ConvertDecToBin {

	public void decimalToBinary(int num){
		int rem;
		int num1=num;
		String str="";
		for (; num!=0 ;) {
			rem=num%2;
			num=num/2;
			str=rem+str;
		}
		str="0"+str;
		System.out.println("num is:"+num1);
		System.out.println("Binary equvalent is :"+str);
	}
	public static void main(String[] args) {
		
		Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		ConvertDecToBin cdb=new ConvertDecToBin();
		cdb.decimalToBinary(num);
		
	}
}
