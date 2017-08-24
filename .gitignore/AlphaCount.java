
public class AlphaCount {

	public static void main(String[] args) {
		String temp="aaaabccbkk";
		String FinalString="";
		char array[]=temp.toCharArray();
		int count=0;
		char tempChar=' ';
		for (int i = 0; i < array.length; i++) {
			if(count==0)tempChar=array[i];
			if(tempChar==array[i])count++;
			if(tempChar!=array[i]){
				FinalString += ""+tempChar + count;
				count=0;
				i--;
			}			
		}//for closed
		FinalString += ""+tempChar + count;
		System.out.println(FinalString);
	}

}
