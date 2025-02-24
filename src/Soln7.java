import java.util.Scanner;
public class Soln7 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Soln7_another ob = new Soln7_another();
        System.out.print("Enter number of terms upto which u want to print the sequence : ");
        int n = sc.nextInt();
        int odd_posn=1;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                ob.evenpart();             
            }
            else
            {
                System.out.print((2*odd_posn) +" ");
                odd_posn++;
            }
        }
    }
}
