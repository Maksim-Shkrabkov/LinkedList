package by.htp.linkedTest;

public class MyNode<E> {
	
	private E currentitem;
	private MyNode<E> prevElement;
	private MyNode<E> nextElement;
	
	
	public MyNode(E currentitem, MyNode<E> prevElement, MyNode<E> nextElement) {
		super();
		this.currentitem = currentitem;
		this.prevElement = prevElement;
		this.nextElement = nextElement;
	}


	public E getCurrentitem() {
		return currentitem;
	}


	public void setCurrentitem(E currentitem) {
		this.currentitem = currentitem;
	}


	public MyNode<E> getNextElement() {
		return nextElement;
	}


	public void setNextElement(MyNode<E> nextElement) {
		this.nextElement = nextElement;
	}


	public MyNode<E> getPrevElement() {
		return prevElement;
	}


	public void setPrevElement(MyNode<E> prevElement) {
		this.prevElement = prevElement;
	}
	
	

}
