package edu.escuelaing.arem.ASE.app;

import java.util.Iterator;

public class IteratorLl<T> implements Iterator<T> {

    Node<T> now;

    /**
     * Creates a LinkedListItereator based on a LinkedList
     * @param l linkedlist to get the iterator from
     */
    public IteratorLl(LinkedList<T> l) {
        now = l.head();
    }
    
    /**
     * Method checks if the itereator has a next node
     * @return boolean indicating if the curretn node has a next one.
     */
    public boolean hasNext() {
        boolean t=true;
        if(now.next==null){ t=false;}

        return t;
    }

    /**
     * method replace the curretn iterator node with the next one 
     * @return T returns the value of the prior iterator node
     */
    public T next() {
        T data = now.getValue();
        now = now.next();
        return data;
    }
}