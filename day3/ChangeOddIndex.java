package week1.day3;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test = "changeme";
        char[] charArray = test.toCharArray();
        for(int i=0; i<=charArray.length-1; i++)
        {
        	char c = test.charAt(i);
        	if(i%2 == 1)
        	{
        		System.out.print(Character.toUpperCase(c));
        	}
        	else
        	{
        		System.out.print(c);
        	}
        	
        }  
	}

	}


