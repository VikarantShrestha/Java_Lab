import java.util.Scanner;
public class Soln14
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int n=sc.nextInt();
        Soln14_another ob = new Soln14_another();

        if(n==ob.reverse(n))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}