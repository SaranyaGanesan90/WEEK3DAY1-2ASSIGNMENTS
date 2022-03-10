package assignment.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int element;
		List <Integer> numbers1=new ArrayList<Integer>();
		numbers1.add(3);
		numbers1.add(2);
		numbers1.add(11);
		numbers1.add(4);
		numbers1.add(6);
		numbers1.add(7);
		
		Collections.sort(numbers1);
	//	System.out.println(numbers1);
		
		element=numbers1.get(numbers1.size()-2);
		System.out.println(element);
	}

}
