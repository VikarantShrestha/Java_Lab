public class Soln7_another 
{
    int fact=1;
    int fact_posn=1;

    public void evenpart()
    {
        fact=fact*fact_posn;
        System.out.print(fact+ " ");
        fact_posn++;
    }
}
