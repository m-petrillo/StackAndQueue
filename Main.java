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
public class Main {
    
    
    Stack myStack = new Stack(8);
    myStack.push("T");
    myStack.push("I");
    myStack.push("T");
    myStack.push("S");
    myStack.push("&");
    myStack.push("A");
    myStack.push("S");
    myStack.push("S");
    System.out.println(myStack.peek());
}
