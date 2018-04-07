/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rahul Ramkumar
 */
public class Rapture 
{
    static int N,E,C; 
    static int[][] getInput() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();
        String[] splited = input.split("\\s+");
        
        N = Integer.parseInt(splited[0]);
        E = Integer.parseInt(splited[1]);
        C = 0;
        int [][] arr = new int[E][3];
                
        for(int i = 0; i<E; i++)
        {
            input = br.readLine();
            splited = input.split("\\s+");
            arr[i][0] = Integer.parseInt(splited[0]);
            arr[i][1] = Integer.parseInt(splited[1]);
            arr[i][2] = Integer.parseInt(splited[2]);
        }  
        return arr;
    }
    
    static void findOut(int [][] arr)
    {
        int initPrice = 0;
        
        int start = 1,end = N+1;
        for(int i = 0; i<E; i++)
        {
            if(arr[i][0] == start)
            {
                start = arr[i][1];
                for(int j = 0; j<2; j++)
                {
                                    
                }                    
            }
            
        }
    }
    
    public static void main(String [] args) throws IOException
    {
        int [][] arr = getInput();
        for(int i = 0; i<E; i++)
        {
            for(int j = 0; j<3;j++)
            {
                System.out.print(arr[i][j] + "  ");                
            }
            System.out.println();
        }       
    }
    
}
