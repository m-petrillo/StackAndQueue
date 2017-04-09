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
public class Queue {
 
    private Node front;
    private Node back;
    
    private Node temp;
    
    public Queue(){
        front = null;
        back = null;
        
    }    
    public void enqueue(Node newNode)
    {
       if( front == null && back == null) 
       {
            back = front = newNode;
       }
        else
       {
            back.next = newNode;
            back = newNode;
            
       } 
        
    }
   
    
    public Node dequeue()
    {
        if(front == null && back == null) { 
        System.out.println("nothing to dequeue.\nqueue is empty."); 
        return null;
        }
        
        else 
        {
         Node oldTail = back;
        Node temp;
        temp = back.prev;
        temp.next = null;
        back = temp;
        return oldTail;
        
        }
       
    }
    
    public void peek()
    {
        System.out.printf("%s", front.data);
    }
    
    public void print()
    {
    Node temp = front;
    while ( temp != null)
    {
    System.out.print(temp.data);    
    temp = temp.next;
    }
    }
}
