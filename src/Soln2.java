public class Soln2 
{
    public static void main(String arg[])
    {
        for(int i=1; i<=1000; i++)
        {
            boolean isPrime=true;
            for(int j=2; j<i; j++)
	    {
	       if(j==i)
	       {
		   continue;
	       }
	       if(i%j==0)
	       {
		  isPrime=false;
		  break;
	       }
	    }
	    if(isPrime==true)
	    {
		System.out.println(i);
	    }
        }
    }
}
