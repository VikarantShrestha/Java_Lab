import java.util.ArrayList;
public class Soln3_another
{
	 ArrayList<Integer> primes = new ArrayList<>();
	 public boolean checkprime(int n)
	 {
	 	boolean isPrime=true;
     	for(int j=2; j<=Math.sqrt(n); j++)
	 	{
	    	// if(j==n)
	    	// {
		  	// 	continue;
	    	// }
	    	if(n%j==0)
	    	{
		  		isPrime=false;
		  		break;
	    	}
	  	}
	  
	    if(isPrime==true)
	    {
			primes.add(n);
			return true;
	    }
		else
		{
			return false;
		}
	 }

	 public void show()
	 {
	 	System.out.print("Prime numbers : ");
	 	for (int e : primes) 
	 	{
            System.out.print(e+",");
        }
	 }
}