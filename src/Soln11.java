import java.util.Scanner;
public class Soln11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter exponent : ");
        int expo = sc.nextInt();
        int power=1;

        for(int i=1; i<=expo; i++)
        {
            power *= base;
        }
        System.out.println(power);
    }    
}
