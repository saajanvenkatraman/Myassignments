package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {
public static void main(String[] args) {
	int first = 0;
	int second= 1;

	int range=10;
	for (int i = 0; i <range; i++) {
		
		int  third= first+second; 
		System.out.println(third);
		first=second;
		second=third;
	
		
	}
}
}
