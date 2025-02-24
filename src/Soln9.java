import java.util.Scanner;
public class Soln9 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value upto which u want sum : ");
        int n=sc.nextInt();
        float sum=0;
        Soln9_another ob = new Soln9_another();
        
        for(int i=1; i<=n; i++)
        {
            sum += (1.0/ob.calcFactByPosn(i));
        }

        System.out.println(sum);
    }    
}
