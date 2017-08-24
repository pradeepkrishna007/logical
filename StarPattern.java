import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		
		System.out.println("enter the input");
		int input = new Scanner(System.in).nextInt();

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if(((j<=i || j>=input-i-1) && i<=input/2)  || (i>input/2 && (j>=i || j<=input-i-1)) ){
				System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}
