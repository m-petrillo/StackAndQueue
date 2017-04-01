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
    int top;
    String arr[];
    
    public Stack(int n)
    {
        maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }
    
    public boolean empty()
    {
      if(top == 0)
      {
          return true;
      }
      else 
          return false;
    }
    
    
    
    

    public void push(String str)
    {
        
    if(top < maxSize)
    {
    arr[top] = str;
    top++;
    }
    }
    
    public String pop(String str)
            {
            if (!this.empty()
                    {
                
                String temp = this.peek();
                    }
            
            
              if (top<maxSize)
              {
                  arr[top-1] = str;
              }
              else {
                  return null;
              }
            }
            
public String peek()
{
   if(top > 0)
   {
    return arr[top-1]; 
   }
   else 
       return null;
}