package week2.day2;

public class FindOccurance {
	public static void main(String[] args) {
		int count=0;
		String s ="TestLeaf";
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			{if (arr[i]=='e') {
				count++;
			}
			}
		}
		System.out.println("The number of occurance of the letter e is:"+count);
	}

}
