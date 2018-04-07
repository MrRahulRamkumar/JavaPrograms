/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.util.Scanner;

/**
 *
 * @author Rahul Ramkumar
 */
public class DecimalToBinary 
{
    public static void main(String [] args)
    {
        int n = 0, remainder = 0,temp = 0, count = 0;
        String number = "";
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sn.nextInt();

        temp = n;
        while (temp != 0) 
        {
            remainder = temp % 2;
            number = number + Integer.toString(remainder);
            temp = temp / 2;
            //sum = sum + remainder * (int)Math.pow(10, count);
            count++;
        }
        System.out.println(reverse(number));
    }
    
    static String reverse(String str)
    {
        String rev = "";
            
        for(int i = str.length()-1; i >= 0; i--)
        {
            rev = rev + Character.toString(str.charAt(i));
        }
        return rev;
    }
}
