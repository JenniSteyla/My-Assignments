package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int input[] = {1,4,3,2,8,6,7};
          Arrays.sort(input);
          for(int i = input[0]; i<=input.length; i++)
          {
        	  if(input[i]!= i+1)
        	  {
        		  System.out.println(i+1);
        		  break;
        	  }
          }
	}

}
