package org.example;

import org.example.List;

public class List {
	Node head;
	Node tail;
	
	List()
	{
		head = null;
		tail = null;
	}
	
	boolean isEmpty()
	{
		if (head == null)
			return true;
		else return false;
	}
	int numberOfElements()
	{
		int k=0;
		Node n = head;
    	while (n != null)
    	{
    		n = n.next;
    		k++;
    	}
		return k;
	}
    void addToHead(int val)
    {
    	Node n = new Node(val);
    	n.next=head;
    	head=n;
    }
    void addToTail(int val)
    {
    	Node n = new Node(val);
    	if (isEmpty())
    	{
    		head = n;
    		tail = n;
    		return;
    	}
    	tail.next = n;
    	tail = n;
    }
    Node find(int _val)
    {
    	Node p = head;
    	if (isEmpty())
    		return p;
    	Node n = head;
    	while (n != null & n.val != _val) 
    	{
    		n=n.next;
    	}
    	return n;
    }
    void print()
    {
    	if (isEmpty()) return;
    	Node i = head;
    	while (i != null)
    	{
    		System.out.println(i.val + " ");
    		i = i.next;
    	}
    }
    boolean deleteFromHead()
    {
    	if (isEmpty()) return false;
    	Node n = head;
    	head = n.next;
    	n = null;
    	return true;
    }
    boolean deleteFromTail()
    {
    	if (isEmpty()) return false;
    	if (head == tail)
    	{
    		deleteFromHead();
    		return true;
    	}
    	Node n = head;
    	while (n.next != tail)
    		n = n.next;
    	n.next = null;
    	/*tail = null;*/
    	tail = n;
    	return true;
    }
    boolean addAfterNode(Node n, int _val)
    {
    	if (isEmpty())
    	{
    		System.out.println("The list is empty!");
    		return false;
    	}
    	if (n == tail)
    	{
    		addToTail(_val);
    		return true;
    	}
    	Node newN = new Node(_val);
    	newN.next = n.next;
    	n.next = newN;
    	return true;
    }
    boolean delete(int _val)
    {
    	if (isEmpty()) return false;
    	if (head.val == _val)
    	{
    		deleteFromHead();
    		return true;
    	}
    	else if (tail.val == _val)
    	{
    		deleteFromTail();
    		return true;
    	}
    	Node n = head;
    	Node p = head.next;
    	while (p != null && p.val != _val)
    	{
    		p = p.next;
    		n = n.next;
    	}
    	if (p == null)
    	{
    		System.out.println("Item not find!");
    		return false;
    	}
    	n.next = p.next;
    	p = null;
    	return true;
    }
    boolean deleteAll()
    {
    	if (isEmpty()) return false;
    	while (head != null)
    		deleteFromHead();
        return true;
    }
    int getVal(int _n)
    {
    	if (isEmpty()) return 0;
    	int _val=0;
    	int k=0;
    	int kolvo=numberOfElements();
    	Node n = head;
    	if (_n==1) 
    		{
    		_val=head.val;
    		return _val;
    		}
    	else if(_n==kolvo) 
    	{
    		{
        		_val=tail.val;
        		return _val;
        		}
    	}
    	else if (_n < kolvo & _n > 0)
    	{
    		while (k != _n & n != null)
    	    {
    		_val = n.val;
    		n = n.next;
    		k++;
    	    }
    	}
    	else
    	{
    		System.out.println("Item not find!");
    		return 0;
    	}
    	return _val;
    }

}
