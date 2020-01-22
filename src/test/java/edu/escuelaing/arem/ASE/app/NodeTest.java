package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.*;

import org.junit.Test;





public class NodeTest {

	@Test
	public void debeCrearNodoConValorYNodosAdyacentesDados() {
		Node<Double> n = new Node<Double> (2.3,null,null);
		Node<Double> n1 = new Node<Double> (2.2,null,null);
		Node<Double> n2 = new Node<Double> (2.0,n1,n);
		
		assertTrue(n2.getValue()==2.0 && n2.getNext().getValue()==2.2 && n2.getPrev().getValue()==2.3);
	}

	public void debeCrearNodoVacio() {
		Node<Double> n = new Node<Double> ();
		assertTrue(n!=null);
	}

	@Test
	public void debeCrearNodoSoloConValor() {
		Node<Double> n = new Node<Double> (2.3);
		assertTrue(n.getValue()==2.3);
		
	}

	@Test
	public void debeDevolverElValorDelNodo() {
		Node<Double> n = new Node<Double> (2.3);
		assertTrue(n.getValue()==2.3);
	}

	@Test
	public void debeCambiarElValorDelNodo() {
		Node<Double> n = new Node<Double> (-2.5);
		n.setValue(2.3);
		assertTrue(n.getValue()==2.3);
	}

	@Test
	public void debeDevolverElSiguienteNodo() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.3);
		Node<Double> n = new Node<Double> (2.3,n1,n2);		
		assertTrue(n.getNext().equals(n1));
	}

	@Test
	public void debeSetElSiguienteNodo() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n = new Node<Double> (2.2,null,null);
		n.setNext(n1);		
		assertTrue(n.getNext().equals(n1));
	}

	@Test
	public void debeDevolverElAnteriorNodo() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);		
		assertTrue(n.getPrev().equals(n2));
	}

	@Test
	public void debeSetElAnteriorNodo() {
		Node<Double> n2 = new Node<Double> (2.3);
		Node<Double> n = new Node<Double> (2.2,null,null);
		n.setPrev(n2);		
		assertTrue(n.getPrev().equals(n2));
	}

	@Test
	public void debeDevolverElSiguienteNodo2() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);		
		assertTrue(n.getNext().equals(n1));
	}

	@Test
	public void debeDevolverElAnteriorNodo2() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);		
		assertTrue(n.getPrev().equals(n2));
	}

	@Test
	public void debeVaciarVaciarElNodo() {
		Node<Double> n1 = new Node<Double> (2.3);
		Node<Double> n2 = new Node<Double> (2.1);
		Node<Double> n = new Node<Double> (2.2,n1,n2);
		n.delete();
		assertTrue(n.getNext()==null && n.getPrev()==null &&
		n.getValue()==null);
	}

}
