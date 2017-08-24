/*				
			Enter number :5
			Factorial is :120
=======================================================================================*/
import java.util.*;
public class FactorialRecursion{
		public int findFact(int num){
		int result;
		if(num==1)
		return 1;
		result=num*findFact(num-1);
		return result;
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number : ");
	int num=Integer.parseInt(sc.next());
	FactorialRecursion fr=new FactorialRecursion();
	System.out.println("\nFactorial is : "+fr.findFact(num));
}
};