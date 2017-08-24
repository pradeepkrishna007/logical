import java.util.ArrayList;
import java.util.List;

public class DuplicateOfN {
	
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		
		int[] num=new int[]{1,2,3,4,3,2,4,5};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]){
					l1.add(num[i]);
				}
			}
		}
		System.out.println(l1);
	}

}
