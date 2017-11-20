package by.htp.linkedTest;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList<String> list = new MyLinkedList<>();
		list.addFirst("a");
		list.addFirst("ab");
		list.addFirst("abc");
		list.addFirst("abcd");
		System.out.println(list.size());
		System.out.println(list.getElementByIndex(0));
		
		Iterator iterator = list.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
