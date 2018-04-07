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
public class Node 
{
    public Node next;
    public int value;
    public Node right;
    public Node left;  
    
    public Node(int value)
    {
        this.value = value;
    }
}
