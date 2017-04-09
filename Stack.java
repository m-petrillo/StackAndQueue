/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue.StackAndQueue;

/**
 *
 * @author Mike
 */
public class Stack {
    
    int maxSize;
    Node top;
    String arr[];
    
    public Stack()
    {
        
    }
    public Stack(int n)
    {
        maxSize = n;
        arr = new String[maxSize];
        top = null;
    }
    
    public boolean empty()
    {
      return top == null;
    }
    
    
    
    

    public void push(Node newNode)
    {
        
    if(empty())
    {
    top = newNode;
    
    
    }
    else 
    {
        newNode.next = top;
        top = newNode;
    }
    }
    
    public String pop()
            {
            if (this.empty())
                    {
                
                return null;
                    }
            else if(size()==1)
                    {
                        Node temp;
                        temp = top;
                      top = null;
                      return temp.data;
                    }
            else
                {
                    Node temp;
                    temp = top;
                    top = top.next;
                    return temp.data;
                    
                }
            }
            
public void peek()
{
    if(!empty())
       System.out.printf("%s", top.data);
}

public int size()
{
    Node temp = top;
    int counter = 0;
    
    while(temp != null)
    {
        counter++;
        temp = temp.next;
    }
    
    return counter;
}

public void print()
    {
    Node temp = top;
    while ( temp != null)
    {
    System.out.print(temp.data);    
    temp = temp.next;
    }
}
}