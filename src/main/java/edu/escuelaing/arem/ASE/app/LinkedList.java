package edu.escuelaing.arem.ASE.app;

/**
 * LinkedList
 */
public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private String type;

    // private ArrayList<Node> lista=new ArrayList<Node>();

    public LinkedList() {
        size = 0;
    }

    public LinkedList(T data) {
        type = data.getClass().getName();
        Node<T> n = new Node<T>(data, null, null);
        head = n;
        tail = n;
        size = 1;
    }

    public boolean add(T data) {
        Node<T> n = new Node<T>(data, null, tail);

        if (size == 0) {
            
            type = data.getClass().getName();
            head = n;
        } else {
            getNode(size-1).setNext(n);
            n.setPrev(tail);

        }
        tail = n;
        size++;

        return true;
    }

    public void add(int index, T data) {
        if (!(index < 0 || index >= size)) {
            Node<T> Iprev = getNode(index - 1);
            Node<T> Inext = getNode(index);
            Node<T> n = new Node<T>(data, Inext, Iprev);
            Iprev.setNext(n);
            Inext.setPrev(n);
            size++;
        } else {
            // exception
        }

    }

    public void clear() {
        while(!(tail==null || head ==null)){
            removeTail();
        }
        head = null;
        tail = null;
        size=0;

    }

    public boolean contains(T data) {
        Node<T> sHead = head;
        while (sHead.getNext() != null) {
            if (sHead.getNext().getValue().equals(data)) {
                return true;
            } else
                sHead = sHead.getNext();

        }
        return false;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            return null;
        } else {
            Node<T> retornar = getNode(index);
            return retornar.getValue();
        }
    }

    private Node<T> getNode(int index) {
        int m = size / 2;
        int it;
        Node<T> F;

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

    public int indexOf(T data) {
        Node<T> sHead = head;
        int index = 0;
        while (sHead.getNext() != null) {
            System.out.println(sHead.getValue());
            System.out.println("la data"+data);
            if (sHead.getValue().equals(data)) {
                System.out.println("index of "+index);
                return index;
            } else
                sHead = sHead.getNext();
            index++;

        }
        return -1;

    }

    public boolean isEmpty() {
        if (size != 0) {
            return false;
        } else
            return true;
    }

    public boolean remove(T data) {
        int exist = indexOf(data);
        if (exist == (-1)) {
            System.out.println("lo hallo");
            System.out.println(exist);
            Node<T> Iprev = getNode(exist).getPrev();
            Node<T> Inext = getNode(exist).getNext();
            Node<T> n = getNode(exist);
            Iprev.setNext(Inext);
            Inext.setPrev(Iprev);
            n.delete();
            n = null;
            return true;

        }
        return false;
    }

    public T remove(int index) {

        if (index < size && index > -1) {
            Node<T> Iprev = getNode(index).getPrev();
            Node<T> Inext = getNode(index).getNext();
            Node<T> n = getNode(index);
            Iprev.setNext(Inext);
            Inext.setPrev(Iprev);
            Node<T> deleted = n;
            n = null;

            return deleted.getValue();

        }
        return null;
    }

    public int size() {
        return size;
    }

    public void removeHead() {

        Node<T> nHead = head.getNext();
        nHead.setPrev(null);
        head.delete();
        head = null;
        head = nHead;

    }

    public void removeTail() {
        Node<T> nTail = tail.getPrev();
        if(!(nTail==null)){
        nTail.setNext(null);
        tail.delete();
        tail = null;
        tail = nTail;
        }
        else{
            head=null;
            tail=null;
        }

    }

    public Node<T> head() {
        return head;
    }

    public Node<T> tail() {
        return tail;
    }

}
