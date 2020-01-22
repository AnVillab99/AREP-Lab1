package edu.escuelaing.arem.ASE.app;


/**
 * Node
 */
public class Node<T> {
    public T value;
    public Node<T> next, prev;

    public Node(){
        
    }

    public Node(T v, Node<T> next, Node<T> prev) {
        value = v;
        this.next = next;
        this.prev = prev;

    }

    public Node(T v) {
        value = v;
        this.next = null;
        this.prev = null;

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prior) {
        this.prev = prior;
    }

    public Node<T> next() {
        return next;
    }

    public Node<T> prev() {
        return prev;
    }

    public void delete() {
        next = null;
        value = null;
        prev = null;
    }

    public boolean equals(Node<T> comp){
        if(this.value.equals(comp.getValue())){
            return true;
        }
        return false;

    }

}
