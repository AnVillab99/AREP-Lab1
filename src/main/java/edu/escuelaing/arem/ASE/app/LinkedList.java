package edu.escuelaing.arem.ASE.app;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * LinkedList
 */
public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    // private ArrayList<Node> lista=new ArrayList<Node>();

    public LinkedList() {
        size = 0;
    }

    public LinkedList(T data) {
        Node<T> n = new Node<T>(data, null, null);
        head = n;
        tail = n;
        size = 1;
    }

    public boolean add(T data) {
        Node<T> n = new Node<T>(data, null, tail);
        tail = n;
        if (size == 0) {
            head = n;
        }
        size++;

        return true;
    }

    public void add(int index, T data) {

        Node<T> Iprev = get(index-1);
        Node<T> Inext = get(index);
		Node<T> n = new Node<T> (data, Inext,Iprev );
		size++;
	}

    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll(int index, Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        // TODO Auto-generated method stub

    }

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public Node<T> get(int index) {
        if (index < size) {
            int m = size / 2;
            int it;
            Node<T> F = null;

            if (index <= m) {                
                F = head;
                for (it=0;it <index; it++) {
                    F = F.getNext();                   
                }

            } else {                
                F = tail;
                for (it=size-1;it >index; it--) {
                    F = F.getPrev();                   
                }

                
            }
            return F;

        } else {
            return null;
        }
    }

    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public Object remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public Object set(int index, Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public List subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray(Object[] a) {
        // TODO Auto-generated method stub
        return null;
    }

}
