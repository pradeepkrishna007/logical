import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FractionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("enter the input");
		int input=inp.nextInt();
		int count=0;
		Set set1=new HashSet<Float>();
		for(int outIndex=1;outIndex<=input;outIndex++){
			for(int inIndex=1;inIndex<=input;inIndex++){
				if(new Float(new Float(outIndex)/inIndex)>=1){
				}else{
					set1.add(new Float(new Float(outIndex)/inIndex));
					//System.out.println(new Float(new Float(outIndex)/inIndex));
				}
			}
		}
		System.out.println(set1.size());
		//System.out.println(set1);
	}
}
