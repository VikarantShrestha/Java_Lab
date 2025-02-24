import java.util.Scanner;

public class Soln4 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms upto which u want to print the sequence : ");
        int n = sc.nextInt();
        int a=0, b=1;
        Soln4_another ob = new Soln4_another();

        for(int i=1; i<=n; i++)
        {
            if(i%2!=0)
            {
                System.out.print(a+" ");
                int temp=a+b;
                a=b;
                b=temp;
            }
            else
            {
                ob.evenpart();
            }
        }
    }    
}
