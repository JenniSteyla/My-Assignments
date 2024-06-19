package week1.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] num = {2,5,7,7,5,9,2,3};
         int length = num.length;
         System.out.println("The length of the array is " +length);
         Arrays.sort(num);
         for (int i = 0; i < num.length-1; i++) 
         {
        	 for (int j = i+1; j < num.length; j++) 
        	 {
        		 if(num[i]==num[j])
        		 {
        			 System.out.println(num[i]);
        		 }
				
			}
        	 // without nested for loop
        	 //for (int i = 0; i < num.length-1; i++) {
//        	 if(num[i]==num[i+1])
//        	 {
//        		 System.out.println(num[i]);
//				
//			}
			
		}
	}

}
