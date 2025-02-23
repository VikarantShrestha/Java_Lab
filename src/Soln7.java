import java.util.Scanner;
public class Soln7 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms upto which u want to print the sequence : ");
        int n = sc.nextInt();
        int fact=1;
        int fact_posn=1;
        int odd_posn=1;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                fact=fact*fact_posn;
                System.out.print(fact+ " ");
                fact_posn++;
            }
            else
            {
                System.out.print((2*odd_posn) +" ");
                odd_posn++;
            }
        }
    }
}
