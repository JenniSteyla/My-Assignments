package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(6);
        numbers.add(8);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("The size of the list is : " +numbers.size());
        for(int i = numbers.get(0); i<numbers.size()-1; i++)
        {
        	if(numbers.get(i)+1 != numbers.get(i+1))
        	{
        		System.out.println(numbers.get(i)+1);
        	}
        }
       
	}


}
