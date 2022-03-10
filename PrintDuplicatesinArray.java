package assignment.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> num=new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		
		//int size = num.size();
		int count;
		
		for(int i=0;i<=num.size()-1	;i++) {
			count=0;
			for(int j=i+1;j<num.size();j++) {
				if(num.get(i)==num.get(j)) 
				
					count++;
					
				}
				if(count>0)
					System.out.println("Duplicates are"+num.get(i));
			}
		}
	}


