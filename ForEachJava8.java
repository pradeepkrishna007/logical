
import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;

public class ForEachJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrLists = (List) Arrays.asList("1","2","3","4");

		//		arrLists.toArray();
		//		for(int i:arrLists){
		//			System.out.println(i);
		//		}

		/*Lambda "->" expression */
		Consumer<String> c=(i) -> System.out.println(i);
		arrLists.forEach(c);
		//		arrLists.forEach(i->System.out.println(i));
	}

}
