package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNoInList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> no = new ArrayList<Integer>();
        int output = 0;
        no.add(3);
        no.add(2);
        no.add(11);
        no.add(4);
        no.add(6);
        no.add(7);
        Collections.sort(no);
        System.out.println("After Sorting : "+no);
        for(int i = no.size(); i>=0; i--)
        {
        	output = output + no.get(i-2);
        	System.out.println("The second largest number in the list is : " +output);
        	break;
        }
	}

}
