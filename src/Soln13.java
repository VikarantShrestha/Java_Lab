import java.util.Scanner;
public class Soln13
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Soln3_another ob = new Soln3_another();
        System.out.print("Enter a num : ");
        int n=sc.nextInt();
        boolean sumFound=false;

        for(int i=1;i<n/2;i++)
        {
            // System.out.print(i+" ");
            // System.out.println(ob.checkprime(i));

            if(ob.checkprime(i) && ob.checkprime(n-i))
            {
                System.out.println("Sum of "+i+" and "+(n-i)+" will give "+n);
                sumFound=true;
            }

        }
        if (!sumFound) 
        {
            System.out.println("There are no prime numbers whose sum is equal to "+n);
        }
    }
}