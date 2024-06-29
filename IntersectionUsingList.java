package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> a = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
        List<Integer> b = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));
        Collections.sort(a);
        Collections.sort(b);
        System.out.println("List 1 : "+a);
        System.out.println("List 2 : "+b);
        System.out.println("The size of List 1 : " +a.size());
        System.out.println("The size of List 1 : " +b.size());
        for(int i = 0; i < a.size(); i++)
        {
        	for(int j = 0; j < b.size(); j++)
        	{
        		if(b.get(j)==a.get(i))
        		{
        			System.out.println("The intersecting element is : " +a.get(i));
        			break;
        		}
        	}
        }
	}

}
