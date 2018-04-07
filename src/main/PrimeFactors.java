/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.math.BigInteger;

/**
 *
 * @author Rahul Ramkumar
 */
public class PrimeFactors 
{
    static void printPrimes()
    {
        BigInteger num = new BigInteger("0");
        while(true)
        {
            num = num.nextProbablePrime();
            System.out.println(num) ;         
        }
    }
    
    public static void main(String[] args) 
    {
        BigInteger num = new BigInteger("600851475143");
        BigInteger two = new BigInteger("2");
        num = two.pow(4096);
        
        BigInteger i = new BigInteger("2");
        
        while(i.compareTo(num) == -1)
        {
            if(num.mod(i) == BigInteger.ZERO)
            {
                System.out.println(i);
            }
            i = i.nextProbablePrime();
        }
    }
    
}
