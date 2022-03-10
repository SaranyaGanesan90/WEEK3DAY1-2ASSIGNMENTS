package assignment.week3;

public class CharOccurence {

	public static void main(String[] args) {
		String str="welcome to chennai";
		int count=0;
		char[] charArray = str.toCharArray();
	for(int i=0;i<charArray.length;i++)
	{
		if(charArray[i]==str.charAt(i)) {
			count++;
	}
		System.out.println(count);
	}

	}

}
