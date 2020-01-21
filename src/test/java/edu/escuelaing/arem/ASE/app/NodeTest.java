package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.*;

import org.junit.Test;




public class NodeTest {

	@Test
	public void testNode() {
		Node<Double> n = new Node<Double> (2.3,null,null);
		assertTrue(n.getValue()==2.3);
	}

	@Test
	public void testNodeT() {
		Node<Double> n = new Node<Double> (2.3);
		assertTrue(n.getValue()==2.3);
		
	}

	@Test
	public void testGetValue() {
		Node<Double> n = new Node<Double> (2.3);
		assertTrue(n.getValue()==2.3);
	}

	@Test
	public void testSetValue() {
		Node<Double> n = new Node<Double> (-2.5);
		n.setValue(2.3);
		assertTrue(n.getValue()==2.3);
	}

	@Test
	public void testGetNext() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.3);
		Node<Double> n = new Node<Double> (2.3,n1,n2);		
		assertTrue(n.getNext().equals(n1));
	}

	@Test
	public void testSetNext() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n = new Node<Double> (2.2,null,null);
		n.setNext(n1);		
		assertTrue(n.getNext().equals(n1));
	}

	@Test
	public void testGetPrev() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);		
		assertTrue(n.getPrev().equals(n2));
	}

	@Test
	public void testSetPrev() {
		Node<Double> n2 = new Node<Double> (2.3);
		Node<Double> n = new Node<Double> (2.2,null,null);
		n.setPrev(n2);		
		assertTrue(n.getPrev().equals(n2));
	}

	@Test
	public void testNext() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);		
		assertTrue(n.getNext().equals(n1));
	}

	@Test
	public void testPrev() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);		
		assertTrue(n.getPrev().equals(n2));
	}

	@Test
	public void testDelete() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);
		n.delete();
		assertTrue(n.getNext()==null && n.getPrev()==null &&
		n.getValue()==null);
	}

}
