import java.util.Random;
public class Soln15_another 
{
    public int genrandom()
    {
        Random r = new Random();  
        int n = r.nextInt(100)+1;
        return n;
    }    
}
