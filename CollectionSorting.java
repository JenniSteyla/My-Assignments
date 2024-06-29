package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<String> companies = new ArrayList<String>();
		String output = " ";
		companies.add("HCL");
		companies.add("Wipro");
		companies.add("Aspire Systems");
		companies.add("CTS");
		System.out.println("The size is : " +companies.size());
		Collections.sort(companies);
		for(int i = companies.size()-1; i>=0; i-- )
		{
			output = output + companies.get(i);
			output = output + " ";
		}
		System.out.println("The reversed output : " +output);
		
		// Another method using Collections.reverse();
	
		//Collections.reverse(companies);
		//System.out.println(companies);
	}

}
