package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		Integer a[]= {3, 2, 11, 4, 6, 7};
		
		List<Integer> body = new ArrayList <Integer>(Arrays.asList(a));
		
		Collections.sort(body);
		System.out.println(body);

		Integer v1 = body.get(4);
		System.out.println(v1);
}
}