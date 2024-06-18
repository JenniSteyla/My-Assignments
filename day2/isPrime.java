package week1.day2;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 12;
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) 
        {
        	if(n%i==0)
        	{
        		isPrime = false;
        	}
        }
        if(isPrime == true)
        {
        	System.out.println("The given number " +n+ "  is prime" );
        }
        else
        {
        	System.out.println("The given number " +n+ " is  not prime" );
        }
			
	}

}
