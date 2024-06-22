package week1.day3;

public class ReverseOddWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test = "I am a software tester";
        String output = "";
        String[] array = test.split(" ");
        for(int i=0; i< array.length; i++)
        {
        	if(i%2!=0)
        	{
        		char[] charArray = array[i].toCharArray();
        		for(int j=charArray.length-1;j>=0;j--)
        		{
            		output = output + charArray[j];
        		}
        	}
        	else
        	{
        		output = output + array[i];
        	}
        	if(i<array.length-1)
        	{
        		output = output +" ";
        	}
        	
        }
        System.out.println("Expected outpout :  " +output);
       
	}

}
