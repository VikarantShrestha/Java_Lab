import java.util.Scanner;
public class Soln14
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int n=sc.nextInt();
        int temp=n, rev=0;

        while(temp!=0)
        {
            int rem= temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        if(n==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}