/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author Rahul Ramkumar
 */
public class BinaryTree 
{
    Node root;
    BinaryTree(int value)
    {
        root = new Node(value);        
    }

    /*Node insert(Node root,int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else if(value > root.value)
        {
            root.right = insert(root.right,value);
        }
        else if(value < root.value)
        {
            root.left = insert(root.left,value);
        }
        return root;
    }*/
    
    void insert(int val)
    {
        Queue<Node> q1 = new LinkedList<>();  
        q1.add(root);
        Node current;
        
        while(true)
        {
            current = q1.remove();
            
            if(current.left == null)
            {
                Node newNode = new Node(val);
                current.left = newNode;
                break;
            }
            else
            {
                q1.add(current.left);
            }
            
            if(current.right == null)
            {
                Node newNode = new Node(val);
                current.right = newNode;
                break;                
            }
            else
            {
                q1.add(current.right);
            }
        }
    }
    
    void search(Node root,int value)
    {
        if(root == null)
        {
            System.out.println("Not Found!");
        }
        else if(value > root.value)
        {
            search(root.right,value);
        }
        else if(value < root.value)
        {
            search(root.left,value);
        }
        else
        {
            System.out.println("Found!!!");
        }
    }
    
    
    void inorder(Node root)
    {
        if (root != null)
        {
            
            System.out.println(root.value);
            inorder(root.left);
            inorder(root.right);
            
        }
    }
    
    public static void main(String [] args)
    {
        BinaryTree tree = new BinaryTree(5);
  
        tree.insert(10);
        tree.insert(15);
        tree.insert(20);
        tree.insert(25);
        
        
        tree.inorder(tree.root);
        
        tree.insert(35);
        tree.insert(40);
        System.out.println();
        tree.inorder(tree.root);
        
       
        
        
    }
}
