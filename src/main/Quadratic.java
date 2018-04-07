package javatest;

import java.util.Scanner;

public class Quadratic
{
    int [] input()
    {
        int [] input = new int[3];
        System.out.println("Enter the co-effecients");
        Scanner sn = new Scanner(System.in);
        
        input[0] = sn.nextInt();
        input[1] = sn.nextInt();
        input[2] = sn.nextInt();
        
        return input;
    }

    void check(int a,int b,int c)
    {
        int product = a*c;
        boolean exit  = false;
        
        if(product>0)
        {
            for(int i = -product; i<=product; i++)
            {
                for(int j = -product; j<=product; j++)
                {
                    if((i+j) == b && (i*j) == product)
                    {
                        System.out.println(i);
                        System.out.println(j);
                        exit = true;
                        break;
                    }
                }
                if(exit)
                {
                    break;
                }
            }
        }
        else
        {
            int m = product*-1;
            for(int i = product; i <= m; i++)
            {
                for(int j = product; j<=m; j++)
                {
                    if((i+j) == b && (i*j) == product)
                    {
                        System.out.println(i);
                        System.out.println(j);
                        exit = true;
                        break;
                    }
                }
                if(exit) //as
                {
                    break;
                }
            }
        }
    }
    public static void main(String [] args)
    {
        Quadratic o1 = new Quadratic();
        int [] input = o1.input();
        System.out.println();
        o1.check(input[0],input[1],input[2]);
    }     
}
