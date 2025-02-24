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

        Soln8_another ob = new Soln8_another();
        System.out.println(ob.gcd(a, b));
    }
}
