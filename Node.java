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
public class Node {
    
    String data;
    Node next;
    Node prev;
    
    public Node (String info, Node n, Node p)
    {
        data = info;
        next = n;
        prev = p;
    }
    
    
    
}
