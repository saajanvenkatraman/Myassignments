package week2.day1;

import java.util.Arrays;

public class FindDups {
	public static void main(String[] args) {
	int number[] = {2, 5, 7, 7, 5, 9, 2, 3};
	Arrays.sort(number);
	System.out.println("Ascending Order");
	for (int i = 0; i < number.length; i++) {
		System.out.println(number[i]);
		
	}
	System.out.println("=====================");
	System.out.println("Duplicates:");
	for (int j = 0; j < number.length-1; j++) {
		if (number[j]==number[j+1]) {
			System.out.println(number[j]);
			
		}
		
		
	}
	}

}
