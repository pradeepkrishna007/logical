package com.logical.mirrorMatrix;

import java.util.Scanner;

public class MirrorMatrix {

	public static int  row,col;

	int [][]sideMatx=new int [row][col];
	int [][]topMatx=new int [row][col];
	
	public void mirrorMatrix(int [][] matx){

		for (int rIndex = 0; rIndex < row; rIndex++) {
			for (int cIndex = 0; cIndex < col; cIndex++) {
				sideMatx[rIndex][cIndex]=matx[rIndex][col-1-cIndex];
				topMatx[rIndex][cIndex]=matx[row-1-rIndex][cIndex];
			}
		}
	}
	
	
	public void displayMatrix(int [][]matx){
		System.out.println("Orignal Matrix is :");
		for (int rIndex = 0; rIndex < row; rIndex++) {
			for (int cIndex = 0; cIndex < col; cIndex++) {
				System.out.print(" "+matx[rIndex][cIndex]);
			}
			System.out.println();
		}
	}
	
	public void displaySideMatrix(){
		System.out.println("Side Matrix is :");
		for (int rIndex = 0; rIndex < row; rIndex++) {
			for (int cIndex = 0; cIndex < col; cIndex++) {
				System.out.print(" "+sideMatx[rIndex][cIndex]);
			}
			System.out.println();
		}
	}
	
	public void displayTopMatrix(){
		System.out.println("Top Matrix is :");
		for (int rIndex = 0; rIndex < row; rIndex++) {
			for (int cIndex = 0; cIndex < col; cIndex++) {
				System.out.print(" "+topMatx[rIndex][cIndex]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row and col :");
		row=sc.nextInt();
		col=sc.nextInt();
		int matx[][]=new int[row][col];
		System.out.println("Enter the elements of the Matrix "+row+"X"+col);
		for (int rIndex = 0; rIndex < row; rIndex++) {
			for (int cIndex = 0; cIndex < col; cIndex++) {
				System.out.print("Enter element for "+rIndex+"X"+cIndex+" : ");
				matx[rIndex][cIndex]=Integer.parseInt(sc.next());
			}
		}
		MirrorMatrix mm=new MirrorMatrix();
		mm.mirrorMatrix(matx);
		mm.displayMatrix(matx);
		mm.displaySideMatrix();
		mm.displayTopMatrix();
	}//main methyod closed.
}
