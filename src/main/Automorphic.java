/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Scanner;

class Automorphic 
{
    int countDigit(int n)
    {
        int count = 0;

        while (n > 0)
        {
            count++;
            n = n / 10;
        }
        return count;
    }

    int input() 
    {
        Scanner sn = new Scanner(System.in);
        int input;
        System.out.println("Enter a number");
        input = sn.nextInt();
        return input;
    }

    void check(int n) 
    {
        int sqr = n * n;
        int temp;
        int number = 0;

        for (int i = 0; i < countDigit(n); i++) 
        {
            number = number + sqr % 10 * (int)Math.pow(10, i);
            sqr = sqr / 10;
        }
        if (number == n) 
        {
            System.out.println(number);//"It is automorphic");
        } else 
        {
            System.out.println(number);//"It is not automorphic");
        }
    }
    
    public static void main(String [] args)
    {
        Automorphic obj1 = new Automorphic();
        obj1.check(obj1.input());        
    }
};



