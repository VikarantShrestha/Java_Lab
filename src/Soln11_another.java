public class Soln11_another 
{
    public int findPower(int base, int expo)
    {
        int power=1;
        for(int i=1; i<=expo; i++)
        {
            power *= base;
        }
        return power;
    }
}
