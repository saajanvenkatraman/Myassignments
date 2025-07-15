package week2.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "stops";
		String s2="potss";
		
		int length1 = s1.length();
		int length2 = s2.length();
		if (length1==length2) {
			
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if (Arrays.equals(arr1, arr2)) {
			System.out.println("The given strings are anagram");
				
			}
			else {
				System.out.println("The given strings are not an Anagram");
			}

		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}
