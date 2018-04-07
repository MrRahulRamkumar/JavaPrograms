
package javatest;

import java.util.Scanner;


public class GuessingGame 
{
    
    static String word = "castle";
        
    void compareStrings(int start,int end) //compares the word and the inputed sub words and returns the score
    {
        int numberOfLetters = end-start+1;     
        System.out.print("Guess " + numberOfLetters + " Letters correspodning to " + start + " to " + end + " : ");
        String input = getInput(start,end);
                
        int score = 0;
        for(int i = 0; i<input.length(); i++)
        {
            for(int j = 0; j<word.length(); j++)
            {
                if(input.charAt(i) == word.charAt(j) && i == j)
                {
                    score += 100;
                }
                else if(input.charAt(i) == word.charAt(j))
                {
                    score += 20;
                }
            }
        }
        System.out.println("Your Score for your input '" + input + "' is " + score); 
        System.out.println();
    }
    
    void check() //checks the user's inputs against the word in a zig zag manner
    {
        int start = 1, end = 3,one = 1,score = 0; 
        String input;
        
        while (end <= word.length()) 
        {

            compareStrings(start, end);
            start = start + one;
            end = end + one;

            if (end == word.length())
            {
                compareStrings(start, end);

                start = start - 1;
                one = -one;
            }
            if (start == 1)
            {
                compareStrings(start, end);

                one = -one;
                end = end + 1;
            }
        }
    }
    
    String getInput(int start,int end) //gets the sub word and puts it in the correct format e.g --ale-
    {
        Scanner sn = new Scanner(System.in);
        String input = sn.next();
        char [] arr = new char [word.length()];//
       
        int inputIndex = 0;
        String nInput = "";
        
        for(int i = 0; i<word.length(); i++)
        {
            if(i >= start-1 && i <= end-1)
            {
                arr[i] = input.charAt(inputIndex);
                inputIndex++;
            }
            else
            {
                arr[i] = '-';
            }
        }
        for(int i = 0; i<word.length(); i++)
        {
            nInput = nInput + Character.toString(arr[i]);
        }
        return nInput;
    }
   
    public static void main (String [] args)
    {
        GuessingGame o1 = new GuessingGame();
        o1.check();
    }
    
}
