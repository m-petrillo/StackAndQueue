/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackandqueue.StackAndQueue;
import java.util.*;



/**
 *
 * @author Mike
 */
public class Main {
    
    public static void main(String[] args)
    {
    
   Stack myStack = new Stack();
   Node myNodeA = new Node ("Car", null, null);
   Node myNodeB = new Node ("Plane", null, null);
   Node myNodeC= new Node ("Train", null, null);
   Node myNodeD = new Node ("Helicopter", null, null);
  
    
    myStack.push(myNodeA);
    myStack.push(myNodeB);
    myStack.push(myNodeC);
    myStack.push(myNodeD);
    
    Queue myQueue = new Queue();
    Node myNodeE = new Node ("School", null, null);
    Node myNodeF = new Node ("House", null, null);
    Node myNodeG = new Node ("Hospital", null, null);
    Node myNodeH = new Node ("Office", null, null);
    
    myQueue.enqueue(myNodeE);
    myQueue.enqueue(myNodeF);
    myQueue.enqueue(myNodeG);
    myQueue.enqueue(myNodeH);
    
    myQueue.print();
    System.out.printf("\n");
    myStack.print();
    System.out.printf("\n");
    
    Queue newQ = StackToQueue(myStack);
    
    
    

    
    }

public static Queue StackToQueue(Stack Name)
{
    Queue myQueue = new Queue();
    String temp1 = Name.pop();
    Node temp = new Node(temp1, null, null);
    
    while(temp1 != null)
    {
        myQueue.enqueue(temp);
        temp1 = Name.pop();
        temp.data = temp1;
    }

        return myQueue;
}

    

}
