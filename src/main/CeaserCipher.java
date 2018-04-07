
package javatest;

import java.util.Scanner;

public class CeaserCipher
{
    public static void main(String [] args)
    {
        Scanner sn = new Scanner(System.in);
	System.out.println("Enter the shift value" );
	int shift = sn.nextInt();
	
	 
	System.out.println("Enter the string");
	String str = sn.next();
        
        char [] arr = new char[str.length()];
        for(int i = 0; i < str.length();i++)
	{
            arr[i] = str.charAt(i);
		
	}
        
		
	for(int i = 0; i < str.length();i++)
	{
            for(int j = 1; j <= shift;j++)
            {
                if(Character.isWhitespace(str.charAt(i)))
                {
                    arr[i] = '*';
                }
                else if(str.charAt(i) <= 'z')
                {
                    arr[i]++;                    
                }
                else
                {
                    arr[i] = 'a';
                }
            }
	}
        String encrypted = "";
        for(int i = 0; i < str.length();i++)
	{
            encrypted = encrypted + Character.toString( arr[i]);		
	}
	System.out.println("Encrypted String: " + encrypted);
    }    
}
    
    

