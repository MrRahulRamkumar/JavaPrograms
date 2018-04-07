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
public class Stack 
{
    String stack[];
    int N,top;
    
    public Stack(int N)
    {
        top = -1;
        this.N = N;
        stack = new String[N];
    }
    void push(String n)
    {
        if(top >= N-1)
        {
            System.out.println("OverFlow!");
            return;
        }
        else if(top == -1)
        {
            top = 0;
            stack[0] = n;
        }
        else
        {
            top++;
            stack[top] = n;
        }
    }
    String pop()
    {
        String del = null;
        if(top == -1)
        {
            System.out.println("UnderFlow!");           
        }
        else
        {
            del = stack[top];
            top--;
        }
        return del;
    }
    
    void postfixToInfix()
    {
        //a*b + c/d - (e-f)
        //ab* + cd/ - ef-
        //ab*cd/+ - ef-
        //ab*cd/+ef--
        Stack stack = new Stack(10);
        String expr = "ab*cd/+ef--";
        String temp = "";
        
        String exp1,exp2;
        for(int i = 0; i<expr.length();i++)
        {
            if(expr.charAt(i) == '*' || expr.charAt(i) == '/' || expr.charAt(i) == '+' || expr.charAt(i) == '-')
            {
                exp1 = stack.pop();
                exp2 = stack.pop();
                temp += exp2 + expr.charAt(i) + exp1;
                stack.push(temp);
                temp = "";
            }
            else
            {
                stack.push(Character.toString(expr.charAt(i)));
            }                
        }
        System.out.println("infix: " + stack.pop());
    }
    
    
    
    public static void main(String [] args)
    {
        Stack o1 = new Stack(100);
    }
}
