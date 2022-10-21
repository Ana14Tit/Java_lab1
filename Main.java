
package org.example;

public class Main {
	public static void main(String[] args) {
		List list = new List();
		System.out.println(list.isEmpty());
		
		list.addToTail(1);
		list.addToTail(2);
		list.addToTail(3);
		list.addToTail(4);
		list.addToTail(5);
		list.addToTail(6);
		System.out.println("List elements: ");
		list.print();
		
		System.out.println("The number of elements in the list: "+list.numberOfElements());
	    System.out.println("The first element: "+list.getVal(1));
	    System.out.println("The last element: "+list.getVal(6));
	    System.out.println("The forth element: "+list.getVal(4));
	    System.out.println(list.isEmpty());
	    
		list.deleteFromHead();
		list.deleteFromTail();
		System.out.println("The list after deleting the first and the last elements: ");
		list.print();
		
		list.addAfterNode(list.find(4), 12);
		
		System.out.println("The list after adding new element after the forth element: ");
		list.print();
		
		list.delete(3);
		System.out.println("The list after deleting the third element: ");
		list.print();
		
		list.deleteAll();
		System.out.println(list.isEmpty());

	}

}
