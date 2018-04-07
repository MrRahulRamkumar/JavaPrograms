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
public class LinkedList 
{
    Node start;
    int length;
    
    
    void addNode(int n)
    {
        if(start == null)
        {
            start = new Node(n);
            length = 1;
        }
        else
        {
            Node newNode = new Node(n);
            Node ptr = start;
            length++;            
            
            while(true)
            {
                if(ptr.next == null)
                {
                    ptr.next = newNode;
                    break;
                }
                ptr = ptr.next;
            }            
        }        
    }
    
    int getNode(int n)
    {
        int count = 0;
        if(start == null)
        {
            return 0;
        }
        else
        {
            Node ptr = start;
            while(true)
            {
                if(count == n)
                {
                    return ptr.value;
                }
                ptr = ptr.next;
                count++;
            }            
        }        
    }
    
    void print()
    {
        Node ptr = start;
        while (true) 
        {
            System.out.println(ptr.value);
            if (ptr.next == null) 
            {
                break;
            }
            ptr = ptr.next;
        }
    }
    
    void reverse() 
    {
        Node prev_ptr = null;
        Node ptr = start;
        Node temp;

        while (ptr != null)
        {
            temp = ptr.next;
            ptr.next = prev_ptr;
            
            prev_ptr = ptr;
            ptr = temp;  
            
        }
        start = prev_ptr;
    }

    public static void main(String [] args)
    {
        LinkedList o1 = new LinkedList();
        
        o1.addNode(12);
        o1.addNode(13);
        o1.addNode(14);
        
        o1.print();
        System.out.println();
        System.out.println(o1.getNode(1));
        
        
    }
}
