package week1.day3;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String text = "We learn Java basics as part of java sessions in java week1";
         int count = 0;
         String[] array = text.split(" ");
         for(int i=0; i<=array.length-1; i++)
         {
        	for(int j=i+1; j<=array.length-1; j++)
        	{
        	   if(array[i].equalsIgnoreCase(array[j]))
        	   {
        		  array[j] = " ";
        		   count++;
        	   }
        	}
           
         }
         for(int i=0; i<=array.length-1; i++)
         {
        	 if(array[i]!=" ")
        	 {
        		 System.out.print(array[i]+ "  ");
        	 }
         }
 }

}
