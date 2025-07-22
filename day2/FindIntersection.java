package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		Integer a1 [] = {3, 2, 11, 4, 6, 7};
		Integer a2 [] = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList <Integer>(Arrays.asList(a1));
		List<Integer> list2 = new ArrayList <Integer>(Arrays.asList(a2));
		
		for (int i = 0; i < a2.length; i++) {
			
			System.out.println(a1[i]);
			if (a1.equals(list2)) {
				System.out.println(a2[i]);
				
			}
		}
			
		}
	
}
