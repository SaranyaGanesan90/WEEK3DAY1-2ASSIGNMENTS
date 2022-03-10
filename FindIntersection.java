package assignment.week3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> numbers1=new ArrayList<Integer>();
numbers1.add(3);
numbers1.add(2);
numbers1.add(11);
numbers1.add(4);
numbers1.add(6);
numbers1.add(7);
List<Integer> numbers2=new ArrayList<Integer>();
numbers2.add(1);
numbers2.add(2);
numbers2.add(8);
numbers2.add(4);
numbers2.add(9);
numbers2.add(7);


for(int i=0;i<numbers1.size();i++) {
	for(int j=0;j<numbers2.size();j++) {
		if(numbers1.get(i)==numbers2.get(j)) 
			System.out.println(numbers1.get(i));
		}
	}
}
	}


