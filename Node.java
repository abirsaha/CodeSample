package abir.java.program;

public class Node<E> {
 
	private E data;
	private Node<E> next;
	
//	Creating node object without any data or next
	public Node() {
		this(null, null);
	}

	public Node(E inputData) {
		// TODO Auto-generated constructor stub
		this(inputData, null);
	}
	
	public Node(E inputData, Node<E> inputNext){
		this.data = inputData;
		this.next = inputNext;
	}
	 
	public E getData() {
		return this.data;
	}
	
	public void setData(E newData) {
		this.data = newData;
	}
	
	public Node<E> getNext() {
		return this.next;
	}
	
	public void setNext(Node<E> nextNode) {
		this.next = nextNode;
	}
}
