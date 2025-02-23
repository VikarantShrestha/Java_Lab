import java.util.Random;
public class Soln15 
{
    public static void main(String arg[])
    {
        Random r = new Random();    
        for(int i=1; i<=5; i++)
        {
            int n = r.nextInt(100)+1;
            System.out.println(n);
        }
    }    
}
