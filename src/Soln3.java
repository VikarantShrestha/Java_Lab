public class Soln3
{
    public static void main(String arg[])
    {
    	Soln3_another ob = new Soln3_another();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=6; i++)
        {
            int c=a+b;
            System.out.println(c);
            ob.checkprime(c);
            a=b;
            b=c;
        }
        ob.show();
    }
}
