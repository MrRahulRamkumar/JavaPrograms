package javatest;

/**
 *
 * @author Rahul Ramkumar
 */
public class Pascal 
{
    static int [] copy;
    static int [] arr;
    static int n = 7;
    public static void main(String [] args)
    {
        int a = 1;
        for (int i = 1; i <= n; i++) 
        {
            arr = new int [i];
            arr[0] = 1;
            arr[i-1] = 1;
                       
            for (int j = 1; j < i - 1; j++)
            {
                arr[j] = copy[j - 1] + copy[j];
            }
            
            for(int k = 0; k <= n-a; k++)//printing the spaces
            {
                System.out.print(" ");
            }
            a++;
                                               
            for (int index = 0; index < i; index++) //printing
            {
                System.out.print(arr[index] + " ");
            }
            System.out.println();
            copy = arr;
        }       
    }
    
}
