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
import java.util.Arrays;

public class Combination 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        combinations2(arr, 3, 0, new int[3]);
    }

    static void combinations2(int[] arr, int len, int startPosition, int[] result)
    {
        if (len == 0)
        {
            for(int index = 0; index < result.length; index++)
            {
                System.out.print(result[index] + " ");
            }
            System.out.println();
            return;
        }       
        for (int i = startPosition; i <= arr.length-len; i++)
        {
            result[result.length - len] = arr[i];
            combinations2(arr, len-1, i+1, result);
        }
    }       
}
