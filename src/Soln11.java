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
        Soln11_another ob = new Soln11_another();
        System.out.println(ob.findPower(base, expo));
    }    
}
