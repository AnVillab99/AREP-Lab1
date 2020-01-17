package edu.escuelaing.arem.ASE.app;

/**
 * Node
 */
public class Node<T> {
    public T value;
    public Node next, prev ;

    public Node( T v, Node next, Node prev) {
        value = v;
        this.next = next;
        this.prev = prev;
        
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

  
   

}
