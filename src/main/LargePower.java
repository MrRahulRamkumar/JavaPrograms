/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Rahul Ramkumar
 */
public class LargePower 
{
    static String pow(String b,String e) 
    {
        BigInteger base = new BigInteger(b);
        BigInteger exponent = new BigInteger(e);
        
        BigInteger result = BigInteger.ONE;
        while (exponent.signum() > 0) 
        {
            if (exponent.testBit(0)) 
            {
                result = result.multiply(base);
            }
            base = base.multiply(base);
            exponent = exponent.shiftRight(1);
        }
        return result.toString();       
    }
    
    public static void main(String [] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int t = Integer.parseInt(br.readLine());
        String input,A,B;
                        
        for(int i = 0; i<t; i++)
        {
            input = br.readLine();
            String[] splited = input.split("\\s+");
            System.out.println(pow(splited[0],splited[1]));            
        }       
    }
}
