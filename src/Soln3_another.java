import java.util.ArrayList;
public class Soln3_another
{
	 ArrayList<Integer> primes = new ArrayList<>();
	 public void checkprime(int n)
	 {
	 	boolean isPrime=true;
     	for(int j=2; j<n; j++)
	 	{
	    	if(j==n)
	    	{
		  		continue;
	    	}
	    	if(n%j==0)
	    	{
		  		isPrime=false;
		  		break;
	    	}
	  	}
	  
	    if(isPrime==true)
	    {
			primes.add(n);
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