import java.util.Scanner;
class NumberToWord
{
	public static int input;

	public static String toWord(int number)
	{
		switch(number)
		{
			case 1: return " One";
			case 2: return " Two";
			case 3: return " Three";
			case 4: return " Four";
			case 5: return " Five";
			case 6: return " Six";
			case 7: return " Seven";
			case 8: return " Eight";
			case 9: return " Nine";
			case 10: return " Ten";
			case 11: return " Eleven";
			case 12: return " Twelve";
			case 13: return " Thirteen";
			case 14: return " Fourteen";
			case 15: return " Fifteen";
			case 16: return " Sixteen";
			case 17: return " Seventeen";
			case 18: return " Eighteen";
			case 19: return " Ninteen";
			case 20: return " Twenty";
			case 30: return " Thirty";
			case 40: return " Fourty";
			case 50: return " Fifty";
			case 60: return " Sixty";
			case 70: return " Seventy";
			case 80: return " Eighty";
			case 90: return " Ninety";
			case 100: return " Hundred";
		}
		return "";
	}
	public static void printTwoDigit(int no1)
	{
		if (no1<20 || no1%10==0)
				System.out.print(toWord(no1));
			else
			{
				int n2=no1%10;
				int n1=(no1/10)*10;
				System.out.print(toWord(n1)+""+toWord(n2));
			}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Any Number :");
		input=sc.nextInt();
		String str=Integer.toString(input);
		if(str.length()==5||str.length()==4)
		{
			if (str.length()==4)
			 str="0"+str;
			int no1=Integer.parseInt(str.charAt(0)+""+str.charAt(1));
			printTwoDigit(no1);
			System.out.print(" Thousand");
			if(str.charAt(2)!='0')
			System.out.print(toWord(Character.getNumericValue(str.charAt(2)))+" Hundred");
			int no3=Integer.parseInt(str.charAt(3)+""+str.charAt(4));
			printTwoDigit(no3);

		}
		else if(str.length()==3)
		{
			if(str.charAt(0)!='0')
			System.out.print(toWord(Character.getNumericValue(str.charAt(0)))+" Hundred");
			int no3=Integer.parseInt(str.charAt(1)+""+str.charAt(2));
			printTwoDigit(no3);
		}
		else if(str.length()==2)
		{
			int no3=Integer.parseInt(str.charAt(0)+""+str.charAt(1));
			printTwoDigit(no3);
		}
		else if(str.length()==1)
		{
			System.out.print(toWord(Character.getNumericValue(str.charAt(0))));
		}
		System.out.print(" Only");
		
	}//main
}