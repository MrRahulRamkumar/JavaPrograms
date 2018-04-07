/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author Rahul Ramkumar
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CloudJump
{

    static int jumpingOnClouds(int[] c, int k) 
    {
        if(k == c.length)
        {
            if(c[0] == 1)
            {
                return 97;
            }
            else
            {
                return 99;
            }
        }
        
        int e = 100;
        int i = k;
        while(true)
        {
            if(c[i] == 1)
            {
                e -= 2;
            }
            e -= 1;
            if(i == 0)
            {
                return e;
            }
            i += k;
            if(i == c.length)
            {
                i = 0;
            }            
        }
        
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++)
        {
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}

