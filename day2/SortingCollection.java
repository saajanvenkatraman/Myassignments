package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		List <String> body = new ArrayList <String> ();
		
		body.add("HCL");
		body.add("Wipro");
		body.add("Aspire Systems");
		body.add("CTS");
		System.out.println("Before Sorting: "+body);
		
		Collections.sort(body,Collections.reverseOrder());
		System.out.println("After Sorting: "+body);
		
		
	}
}
