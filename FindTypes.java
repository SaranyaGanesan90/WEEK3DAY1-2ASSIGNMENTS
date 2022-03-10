package assignment.week3;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] cs = test.toCharArray();
		for(int i=0;i<cs.length;i++) {
			if (Character.isLetter(cs[i]))
			{
				letter++;
				
				}else if (Character.isDigit(cs[i]))
					{
					num++;
					}
				 else if ( Character.isWhitespace(cs[i]))
				{
					space++;
					
				
					}
				else {
					specialChar++;
				}
		}
				 System.out.println("letter: "+letter);
					System.out.println("number:"+num);
					System.out.println("space: "+space);
					System.out.println("Special Charater :"+specialChar);
	}
}



