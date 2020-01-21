package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
/*
	@Test
	public void seDebeCrearUnaLinkedListVacia() {
		LinkedList<Double> l = new LinkedList<Double> ();
		assertTrue(l.size()==0);
	}

	@Test
	public void seDebeCrearUnaLinkedListConUnNodoMismaHeadTail() {
		LinkedList<Double> l = new LinkedList<Double> (2.3);
		assertTrue(l.size()==1 && l.head()!=null && l.tail()!=null && l.head().getValue()==2.3 && l.tail().getValue()==2.3);
		
	}

	@Test
	public void seDebePoderAgregarUnValoraLaLinkedList() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		assertTrue(l.size()==1 && l.head()!=null && l.tail()!=null && l.head().getValue()==2.3 && l.tail().getValue()==2.3);
	}

	@Test
	public void seDebePoderAgregarBAsadoEnUnIndexEspecifico() {
	    LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(1,2.4);
		assertTrue(l.tail().getValue()==2.2 && l.head().getValue()==2.3);
	}

	@Test
	public void deberiaVaciarLaLinkedList() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(1,2.4);
		l.clear();
		assertTrue(l.size()==0 && l.head()==null && l.tail()==null);
	}

	@Test
	public void debeHallarSiLaLinkedListContieneUnElemento() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(2.4);
		l.add(-9.6);
		assertTrue(l.contains(2.4));
	}

	@Test
	public void debeDevolverElObjetoEnLaposcicionDada() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(2.4);
		l.add(-9.6);
		assertEquals(l.get(1),2.2);
	}

	@Test
	public void debeDevolverElindiceDondeEstaElValorSiExisteEnLaLinkedList() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(2.4);
		l.add(-9.6);
		int u = l.indexOf(2.4);
		assertEquals(u,2);
	}

	@Test
	public void debeVerificarQueLaListaEsteONoVacia() {
		LinkedList<Double> l = new LinkedList<Double> ();
		LinkedList<Double> l2 = new LinkedList<Double> (2.3);
		assertTrue(l.isEmpty() && !(l2.isEmpty()));
	}
*/
	@Test
	public void testRemoveT() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(2.4);
		l.remove(2.4);
		l.head();
		System.out.println("wegweg");
		assertTrue(l.tail().getValue()==2.2);
	}

	@Test
	public void testRemoveInt() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(2.4);
		l.remove(2);
		assertTrue(l.tail().getValue()==2.2);
	}

	@Test
	public void testSize() {
		LinkedList<Double> l = new LinkedList<Double> ();
		l.add(2.3);
		l.add(2.2);
		l.add(2.4);
		assertTrue(l.size() == 3);
	}

}
