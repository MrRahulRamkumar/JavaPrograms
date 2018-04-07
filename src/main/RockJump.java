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
public class RockJump 
{
    static int n = 7;
    static int dist[] = {10,20,20,37,13,30};

    static int findOut() 
    {
        int jumpCount = 0;
        int startPos = 0;
        int endPos = 0;
        int currentPos = 0;
        int distSum = 0;
        for (int i = 0; i < n - 1; i++)
        {
           distSum += dist[i];
            if (distSum <= 50) 
            {
                currentPos++;
                if(currentPos == n-1)
                {
                    startPos = endPos;
                    endPos = currentPos;
                    System.out.println(startPos + " --> " + endPos);
                    jumpCount++;
                }
            } 
            else
            {
                startPos = endPos;
                endPos = currentPos;
                System.out.println(startPos + " --> " + endPos);
                jumpCount++;
                i--;
                distSum = 0;
            }
        }
        return jumpCount;
    }

    public static void main(String [] args)
    {
        System.out.println("Jumps: " + findOut());
    }
}
