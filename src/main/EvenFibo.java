
import java.util.Scanner;

/**
 *
 * @author Rahul Ramkumar
 */
public class EvenFibo 
{
    static long findSum(long n)
    {
        long sum = 0l,evenSum = 2l,f = 1l,s = 2l;
        while(true)
        {
            sum = f + s;
            if(sum >= n)
            {
                break;
            }
            if(sum % 2 == 0)
            {
                evenSum = evenSum + sum;
            }
            f = s;
            s = sum;
        }
        return evenSum;
    }
    public static void main (String [] args)
    {
        Scanner sn = new Scanner(System.in);
        
        long t = sn.nextLong();
        for(long i = 0l; i<t; i++)
        {
            System.out.println(findSum(sn.nextLong()));                       
        }         
    }     
}