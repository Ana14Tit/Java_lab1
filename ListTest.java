package org.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListTest {
private List list, list1, list2;
	@Before
	public void setUp()
	{
		list=new List();
		
		list1=new List();
		list1.addToTail(10);
		list1.addToTail(9);
		list1.addToTail(8);
		list1.addToTail(7);
		list1.addToTail(6);
		
		list2=new List();
		list2.addToTail(11);
	}
	@Test
	public void testIsEmpty() {
		assertTrue(list.isEmpty());
	
		assertFalse(list1.isEmpty());
		
	}
	@Test
	public void testnumberOfElements() {
		assertEquals(list.numberOfElements(),0);
		
		assertEquals(list1.numberOfElements(),5);
	}
	

	@Test
	public void testDeleteFromHead() {
		assertFalse(list.deleteFromHead());
		
		assertTrue(list1.deleteFromHead());
		assertEquals(list1.getVal(1),9);
		
	}

	@Test
	public void testDeleteFromTail() {
        assertFalse(list.deleteFromTail());
        
        assertTrue(list2.deleteFromTail());
		
        assertTrue(list1.deleteFromTail());
		assertEquals(list1.getVal(4),7);
		/*assertEquals(list1.getVal(5),6);*/ /*вызывает ошибку во время теста, 
		                                      * т.к. элемент удалён*/
	}

	@Test
	public void testAddAfterNode() {
		assertFalse(list.addAfterNode(list.find(8), 22));
		
		assertTrue(list1.addAfterNode(list1.find(8), 22));
		assertEquals(list1.getVal(4), 22);
	}

	@Test
	public void testDelete() {
		assertFalse(list.delete(2));
		
		assertTrue(list1.delete(10));
		assertTrue(list1.delete(6));
		assertTrue(list1.delete(8));
		
		assertFalse(list1.delete(12));
		
	}

	@Test
	public void testDeleteAll() {
        assertFalse(list.deleteAll());
		
		assertTrue(list1.deleteAll());
	}

	@Test
	public void testGetVal() {
		assertEquals(list.getVal(3),0);
		
		assertEquals(list1.getVal(1),10);
		assertEquals(list1.getVal(5),6);
		assertEquals(list1.getVal(3),8);
		assertEquals(list1.getVal(12),0);
	}

}
