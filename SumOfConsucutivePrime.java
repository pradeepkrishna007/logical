import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SumOfConsucutivePrime {
	public static void main(String[] args) {
		System.out.print("Please enter the inputs :: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		List list = new ArrayList<>();
		list.add(2);
		System.out.println(2);
		for (int i = 3; i <= input; i++) {
			int j = 2, flag = 0;
			while (i % 2 != 0 && j <= i / 2) {
				if (i % j == 0) {
					flag = 1;
				}
				j++;
			} // while
			if (flag != 1 && i % 2 != 0) {
				// System.out.println(i);
				list.add(i);
			}
		} //
		int result = findConsucutiveSum(list);
		System.out.println("Result of Higest consucutive number between range " + input + " is :: " + result);
	}

	private static int findConsucutiveSum(List<Integer> list) {
		System.out.println(list);
		TreeSet<Integer> set = new TreeSet();
		for (int i = 0; i < list.size(); i++) {
			int sum = 0,counter=0;
			for (int j = i; j < list.size(); j++,counter++) {
				if(sum > list.get(list.size()-1)) break;
				sum += list.get(j);
				if (list.contains(sum) && counter > 1) {
					set.add(sum);
				}
			}
		}

		return set.last();
	}

}// closed
