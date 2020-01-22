package edu.escuelaing.arem.ASE.app;

import java.util.Iterator;
import java.util.List;

/**
 * 
 * LinkedList class Is a genereic list that consist of multiple Nodes connected.
 */
public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;
    private String type;

    // private ArrayList<Node> lista=new ArrayList<Node>();
    /**
     * Empty contructor
     */
    public LinkedList() {
        size = 0;
    }

    /**
     * Constructor that recieves 1 data set and converts it to a node
     * 
     * @param data the value of the first node
     */
    public LinkedList(T data) {
        type = data.getClass().getName();
        Node<T> n = new Node<T>(data, null, null);
        head = n;
        tail = n;
        size = 1;
    }

    /**
     * Constructor that receives a T data array
     * 
     * @param dat array of data T
     */
    public LinkedList(T[] dat) {

        type = dat.getClass().getName();

        Node<T> pre = null;
        Node<T> nex = null;
        int s = 0;
        for (T x : dat) {
            Node<T> n = new Node<T>(x, nex, pre);
            if (s == 0) {
                head = n;
            }
            if (!(s == 0)) {
                pre.setNext(n);
            }
            pre = n;
            if (s == dat.length) {
                tail = n;
            }
            s++;

        }

        size = s;
    }

    /**
     * Method add a single T data element
     * 
     * @param data T elemtn to add
     * @return boolean indicating if it was added
     * @throws Exception if the data type added doesn't match with the linkedlist data type
     */
    public boolean add(T data) throws Exception {

        if (type == data.getClass().getName()) {

            Node<T> n = new Node<T>(data, null, tail);

            if (size == 0) {

                type = data.getClass().getName();
                head = n;
            } else {
                getNode(size - 1).setNext(n);
                n.setPrev(tail);

            }
            tail = n;
            size++;

            return true;
        } else {
            throw new Exception("Data type is not compatible with curretn LinkedList");
        }
    }

    /**
     * Method adds an element T in poscision index
     * 
     * @param index poscision where to add the data
     * @param data  T to be added
     * @throws Exception if the data type added doesn't match with the linkedlist data type
     */
    public void add(int index, T data) throws Exception {
        if (!(index < 0 || index >= size || type == data.getClass().getName())) {
            Node<T> Iprev = getNode(index - 1);
            Node<T> Inext = getNode(index);
            Node<T> n = new Node<T>(data, Inext, Iprev);
            Iprev.setNext(n);
            Inext.setPrev(n);
            size++;
        } else {
            throw new Exception("Data type is not compatible with curretn LinkedList");
        }

    }

    /**
     * Method adds to the linkedlist elements of an T data array
     * @param dat T data array
     * @return boolean indicating if the array was added
     * @throws Exception if the data type added doesn't match with the linkedlist data type
     */
    public boolean addAll(T[] dat) throws Exception {
        if (type == dat.getClass().getName()) {

            Node<T> pre = tail;
            Node<T> nex = null;
            int s = size;
            for (T x : dat) {
                Node<T> n = new Node<T>(x, nex, pre);
                if (s == 0) {
                    head = n;
                }
                if (!(s == 0)) {
                    pre.setNext(n);
                }
                pre = n;
                if (s == dat.length) {
                    tail = n;
                }
                s++;
            }

            size = s;
            return true;
        }
        else  throw new Exception("Data type is not compatible with curretn LinkedList");
    }

    /**
     *  Method clears the linked list
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.gc();

    }

    /**
     * Methos that search for an specific value on the linkedlist  
     * @param data Value to search on the linkedlist
     * @return boolean indicating if the value is present on the linkedlist
     */
    public boolean contains(T data) {

        if (type == data.getClass().getName()) {

            Node<T> sHead = head;
            while (sHead.getNext() != null) {
                if (sHead.getNext().getValue().equals(data)) {
                    return true;
                } else
                    sHead = sHead.getNext();

            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * method returns an specific value based on an index
     * @param index int that indicates which value to return
     * @return T or null if the index is wrong
     */
    public T get(int index) {
        if (index >= size || index < 0) {
            return null;
        } else {
            Node<T> retornar = getNode(index);
            return retornar.getValue();
        }
    }

    /**
     * Method return the node in an specific location
     * @param index position of the node to extract
     * @return the node on the location or null if the location is invalid
     */
    private Node<T> getNode(int index) {
        int m = size / 2;
        int it;
        Node<T> F = null;
        

        if (index <= m) {
            F = head;
            it = 0;
            while (it < index) {
                F = F.getNext();
                it++;
            }

        } else {
            it = size - 1;
            F = tail;
            while (it > index) {
                F = F.getPrev();
                it--;
            }

        }
        return F;

    }

    /**
     * Method returns the index of an specific value
     * @param data the value to be searched
     * @return the index of the node where the value is stored, or -1 if it isn't found
     */
    public int indexOf(T data) {

        type = data.getClass().getName();
        
        Node<T> sHead = head;
        int index = 0;

        while (index < size) {
            if (sHead.getValue().equals(data)) {
                return index;
            } else
                sHead = sHead.getNext();
            index++;

        }
        return -1;

    }
    
    /**
     * Method return a boolean indicating if the list is empty
     * @return boolean
     */
    public boolean isEmpty() {
        if (size != 0) {
            return false;
        } else
            return true;
    }

    /**
     * Method remove a node based on an specific value
     * @param data data that the node to be deleted contains
     * @return boolean indicating if the node was deleted
     * @throws Exception if the data type to be searched isn't the same as the linkedlist
     */
    public boolean remove(T data) throws Exception {

        if (type == data.getClass().getName()) {

            int exist = indexOf(data);
            if (exist != (-1)) {

                Node<T> Iprev = getNode(exist).getPrev();
                Node<T> Inext = getNode(exist).getNext();
                Node<T> n = getNode(exist);

                if (exist == size - 1) {
                    tail = Iprev;
                    Iprev.setNext(Inext);

                } else if (exist == 0) {
                    head = Inext;
                    Inext.setPrev(Iprev);

                } else {
                    Iprev.setNext(Inext);
                    Inext.setPrev(Iprev);
                }
                n.delete();
                n = null;
                return true;

            }
            return false;
        } else
            throw new Exception("Data type is not compatible with curretn LinkedList");
    }

    /**
     * Method removes a node based on its position
     * @param index position of the node to be removed
     * @return boolean indicating if the node was removed
     */   
    public T remove(int index) {

        if (index < size && index > -1) {
            Node<T> Iprev = getNode(index).getPrev();
            Node<T> Inext = getNode(index).getNext();
            Node<T> n = getNode(index);
            if (index == size - 1) {
                tail = Iprev;
                Iprev.setNext(Inext);

            } else if (index == 0) {
                head = Inext;
                Inext.setPrev(Iprev);

            } else {
                Iprev.setNext(Inext);
                Inext.setPrev(Iprev);
            }
            Node<T> deleted = n;
            n = null;

            return deleted.getValue();

        }
        return null;
    }

    /**
     * Method returns the size of the linkedlist
     * @return int the size of the linkedlist
     */
    public int size() {
        return size;
    }

    /**
     * Method remove the head of the linkedlist
     */
    public void removeHead() {

        Node<T> nHead = head.getNext();
        nHead.setPrev(null);
        head.delete();
        head = null;
        head = nHead;

    }

    /**
     * Method removes the tail of the linkedlist
     */
    public void removeTail() {
        Node<T> nTail = tail.getPrev();
        if (!(nTail == null)) {
            nTail.setNext(null);
            tail.delete();
            tail = null;
            tail = nTail;
        } else {
            head = null;
            tail = null;
        }

    }

    /**
     * Method returns the head of the linkedlist
     * @return Node<T> the head of the linked list
     */
    public Node<T> head() {
        return head;
    }

     /**
     * Method returns the tail of the linkedlist
     * @return Node<T> the tail of the linked list
     */
    public Node<T> tail() {
        return tail;
    }

    
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
