public class Soln1 
{
    public static void main(String arg[])
    {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int sum=a+b;
        for(int i=1;i<=8; i++)
        {
            int c=a+b;
            sum=sum+c;
            System.out.println(c);
            a=b;
            b=c;
        }
        System.out.println("Sum : "+sum);
    }
}
