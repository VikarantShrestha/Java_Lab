import java.util.Scanner;
public class Soln6 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Soln6_another ob = new Soln6_another();
        System.out.print("Enter number to find its factorial : ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" : "+ob.fact(n));
    }    
}
