package assignment.week3;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int length1 = text1.length();
		int length2 = text2.length();
		
		if(length1==length2) {
			
		
			char[] Array1 = text1.toLowerCase().toCharArray();
			char[] Array2 = text2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			boolean	status=Arrays.equals(Array1, Array2);
			
			if(status) {
		
		System.out.println(text1 + "and" +text2+"are anagrams");
		}
		else
		{
			System.out.println(text1 + "and" +text2+"are not anagrams");
		}
		}	
			
		}

	}


