package week2.day2;

public class ChangeOddIndex {
	public static void main(String[] args) {
		String test = "changeme";
		char[] a1 = test.toCharArray();
		for (int i = 0; i < a1.length; i++) {
			if (i%2!=0) {
				a1[i]= Character.toUpperCase(a1[i]);
			}
			
		}
		System.out.println(a1);
	}

}
