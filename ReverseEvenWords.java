package assignment.week3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str="I am a software tester";
		
		char[] charArray = str.toCharArray();
		String oddArray="";
		String evenArray="";
		for(int i=1;i<charArray.length-1;i++) 
		{
			if(!(i%2==0)) {
				
				
				oddArray=oddArray+charArray[i];
			
			System.out.println(oddArray);
			}
		}
			
			for(int j=charArray.length-1;j>=1;j--)
			{
				if(j%2==0) {
					evenArray=evenArray+charArray[j];
					System.out.println(evenArray);
				}
				else
				{
					System.out.println(charArray);
				}
			}
		}
	}


