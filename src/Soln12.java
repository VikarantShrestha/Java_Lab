import java.util.Scanner;
public class Soln12 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to find its factors : ");
        int n=sc.nextInt();
        Soln12_another ob = new Soln12_another();
        ob.showFactors(n);
        
    }    
}
