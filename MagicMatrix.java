package com.nacre.logical;

import java.util.Scanner;

/**
 * @author Pradeep Kumar
 *
 */

public class MagicMatrix {

	public void checkMagicMatrix(int [][]matx){
		
		int row=matx.length;
		boolean flag=false;
		flag=checkValue(row,matx);
	
		if(flag){
			System.out.println("Element should be less than "+(row*row));
			System.exit(0);
		}
		else{
		flag=checkUniqueness(matx);	
		if(flag){
			System.out.println("Element should be Unique ");
			System.exit(0);
		}else{
			int dSum=0;
			int []rSum=new int[row];
			int []cSum=new int[row];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < row; j++) {
					rSum[i]+=matx[i][j];
					cSum[i]+=matx[j][i];
					if(i==j)
						dSum+=matx[i][j];
				}//for j loop
			}//for i loop
			if(rSum[row-1]==cSum[row-1]&&rSum[row-1]==dSum&&cSum[row-1]==dSum){
				System.out.println("Matrix is Magic Matrix ");
			}else
				System.out.println("Matrix is not Magic Matrix");
		}//else
		}//else
	}//checkMatrix closed.
	
	
	
	
	
	
	private boolean checkUniqueness(int[][] matx) {
		boolean flag=false;
		for (int i = 0; i < matx.length; i++) {
			for (int j = 0; j < matx.length; j++) {
				for (int j2 = 0; j2 < matx.length; j2++) {
					for (int k = 0; k < matx.length; k++) {
						if(!(i==j2&&j==k))
						if(matx[i][j]==matx[j2][k])
							return true;
					}
				}
			}
		}
		
		return flag;
	}//checkUniqueness






	private boolean checkValue(int row, int[][] matx) {
		// TODO Auto-generated method stub
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(matx[i][j]>(row*row))
					return true;
			}
		}
		return false;
	}






	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the row and col of matrix :");
	int row=Integer.parseInt(sc.next());
	int col=Integer.parseInt(sc.next());
	if(row==col){
		int [][]matx=new int[row][col];
		System.out.println("Enter the element of matrix \n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter elements of "+i+"X"+j+" :");
				matx[i][j]=Integer.parseInt(sc.next());
			}
		}//for i closed.
		MagicMatrix mm=new MagicMatrix();
		mm.checkMagicMatrix(matx);
	}//if closed
	else{
		System.out.println("Row and col Should be same ");
		System.exit(0);
	}
		
	}
}//class closed.
