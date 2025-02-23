import java.util.Scanner;
public class Soln12 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to find its factors : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }    
}
