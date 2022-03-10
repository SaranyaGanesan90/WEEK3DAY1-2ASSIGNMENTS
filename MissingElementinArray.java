package assignment.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class MissingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			List <Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		
			
			Collections.sort(num);
			System.out.println(num);
			int i;
			for(i=num.get(0);i<=num.size();i++) {
				if(i!=num.get(i-1))
				{
					System.out.println("The missing number is:"+i);
				break;
				}
				}
				
			}
			
			

	
}
