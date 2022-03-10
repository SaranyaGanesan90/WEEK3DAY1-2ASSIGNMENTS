package assignment.week3;



public class StringPalindrome {

	public static void main(String[] args) {
		String value = "madam";
		String revvalue ="";
		int length = value.length();
		
		for(int i=(length-1);i>=0;i--) {
			revvalue=revvalue+value.charAt(i);
		}
			if(value.toLowerCase().equals(revvalue.toLowerCase())) {
				System.out.println(value + "String is Palindrome");
				
			}else
			{System.out.println(value + "String is not Palindrome");
		}

	}

	}

