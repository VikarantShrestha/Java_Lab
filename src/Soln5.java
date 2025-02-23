import java.util.Scanner;
public class Soln5 
{
    public static void main(String arg[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number upto which u want to print the sequence : ");
        int n=sc.nextInt();
        int a=0, b=1, ev=-1;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(ev+ " ");
                ev -=3;
            }
            else
            {
                System.out.print(a+ " ");
                int temp=a+b;
                a=b;
                b=temp;
            }
        }
    }
}