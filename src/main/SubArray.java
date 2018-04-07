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
public class SubArray 
{
    int [][] arr = {{1,1,1,1,1},
                    {1,1,1,1,0},
                    {1,1,1,1,0},
                    {1,1,1,1,0},
                    {1,1,1,1,1},
                    {0,0,0,0,0}};  
    
    int columnLength = arr[0].length, rowLength = arr.length;
    
    void check()
    {      
        int count = 0;
        int tempCount = 0;
        for(int row = 0; row < rowLength; row++)
        {
            for(int column = 0; column < columnLength; column++)
            {
                if(arr[row][column] == 1)
                {
                    tempCount = cross(row,column);
                    if(tempCount > count)
                    {
                        count = tempCount;
                    }
                }
            }           
        }
        System.out.println("Max: " + count);
        System.out.println();
        for(int row = 0; row<count; row++)
        {
            for(int column = 0; column < count; column++)
            {
                System.out.print(1 + " ");
            }
            System.out.println();              
        }      
    }
    int downCount(int row,int column,int max)
    {
        int downMax = 0;
        for(int i = row; i < rowLength; i++)
        {
            if(arr[i][column] == 1)
            {
                downMax++;
                if(downMax == max)
                {
                    break;
                }
            }
            else
            {
                break;
            }
        }
        return downMax;
    }
    int rightCount(int row,int column,int max)
    {
        int rightMax = 0;
        for(int i = column; i < columnLength; i++)
        {
            if(arr[row][i] == 1)
            {
                rightMax++;
                if(rightMax == max)
                {
                    break;
                }
            }
            else
            {
                break;
            }
        }
        return rightMax;
    }
    
    int cross(int row,int column)
    {
        int count = 0;
        int downMax;
        int rightMax;
        int max = rowLength + columnLength;
        
        while(row < rowLength && column < columnLength)
        {
            if(arr[row][column] == 1)
            {
                count++;
                downMax = downCount(row,column,max-1);
                rightMax = rightCount(row,column,max-1);   
                
                if(downMax < rightMax) //finding whichever is the least.
                {
                    max = downMax;
                }
                else
                {
                    max = rightMax;
                }                
            }
            else
            {
                break;
            }
            if(max == 1)
            {
                break;
            }                
            column++;
            row++;            
        }    
        return count;
    }
    
    public static void main(String [] args)
    {
        SubArray o1 = new SubArray();
        o1.check();        
    }
        
}
            

