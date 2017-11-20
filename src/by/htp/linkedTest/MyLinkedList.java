package by.htp.linkedTest;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E>, Iterable<E>, DescendingIterator<E> {
	
	private MyNode<E> fstNode;
	private MyNode<E> lstNode;
	private int size = 0;
	
	
	public MyLinkedList() {
		
		lstNode = new MyNode<E>(null, fstNode, null);
		fstNode = new MyNode<E>(null, null, lstNode);
	
	}


	@Override
	public void addLast(E e) {
		MyNode<E> prev = lstNode;
		prev.setCurrentitem(e);
		lstNode = new MyNode<E>(null, prev, null);
		prev.setNextElement(lstNode);
		size++;
	}


	@Override
	public void addFirst(E e) {
		MyNode<E> next = fstNode;
		next.setCurrentitem(e);
		fstNode = new MyNode<E>(null, null, next);
		next.setPrevElement(fstNode);
		size++;
		
	}


	@Override
	public int size() {
		return size;
	}


	@Override
	public E getElementByIndex(int count) {
		MyNode<E> target = fstNode.getNextElement();
		for(int i = 0; i < count; i++) {
			target = getNextElement(target);
		}
		return target.getCurrentitem();
	}
	
	private MyNode<E> getNextElement(MyNode<E> current){
		return current.getNextElement();
	}


	@Override
	public Iterator<E> iterator() {
		
		return new Iterator<E> () {
			
			int counter = 0;

			@Override
			public boolean hasNext() {
				return counter < size;
			}

			@Override
			public E next() {
				return getElementByIndex(counter);
			}
			
		};
	}


	@Override
	public Iterator<E> descendingIterator() {
		return new Iterator<E> () {
			
			int counter = size - 1;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return counter >= 0;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return getElementByIndex(counter--);
			}
			
		};
	}





	
	
	
	



}
