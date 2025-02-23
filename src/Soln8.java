import java.util.Scanner;
public class Soln8 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int a= sc.nextInt();
        System.out.print("Enter second num : ");
        int b= sc.nextInt();

        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
