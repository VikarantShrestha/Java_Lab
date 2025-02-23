import java.util.Scanner;
public class Soln6 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int fact=1;
        System.out.print("Enter number to find its factorial : ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" : "+fact);
    }    
}
