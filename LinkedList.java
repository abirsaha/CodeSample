package abir.java.program;

public class LinkedList<E> {
  
	protected Node<E> head;
	protected Node<E> tail;
	protected int listSize;
	
	public LinkedList() {
		
		this.head = null;
		this.tail = null;
		this.listSize = 0;
	}
	
	public String toString() {
		Node<E> currentNode = this.head;
		StringBuilder output = new StringBuilder();
		output.append("[");
		while(currentNode != null) {
			
			output.append(currentNode.getData());
			
			currentNode = currentNode.getNext();
			if(currentNode != null) {
				output.append("->");
			}
		}
		output.append("]");
		return output.toString();
	}
	
	public int size() {
		return this.listSize;
	}
	
	private boolean isEmpty() {
		return this.size() == 0;
	}
	
	public E clear() {
		E headData = this.get(1);
		head = null;
		tail = null;
		listSize = 0;
		return headData;
	}
	
	public void insert(E newInput) {
		this.addTotail(newInput);
	}

	private void addTotail(E newInput) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<>(newInput);
		
		if(this.isEmpty()) {
			this.head = newNode;
			this.tail = head;
		} else {
			(this.tail).setNext(newNode);
			this.tail = newNode;
		}
		this.listSize++;
		
	}
	
	public void addTohead(E data) {
		Node<E> newNode = new Node<>(data);
		
		if(this.isEmpty()) {
			this.head = newNode;
			this.tail = head;
		} else {
			newNode.setNext(this.head);
			this.head = newNode;
		}
		this.listSize++;
	}
	
	public void addAfterIndex(E data, int index) {
		if (index <=0) {
			this.addTohead(data);
		} else if (index >= this.size()) {
			this.addTotail(data);
		} else {
			 Node<E> newNode = new Node<>(data);
			 Node<E> targetNode = this.head;
			 
			 for (int i=1;i < index; i++) {
				 targetNode = targetNode.getNext();
			 }
			 
			 newNode.setNext(targetNode.getNext());
			 targetNode.setNext(newNode);
			 this.listSize++;
			 
		}
	}
	
	public E get(int index) {
		if (index <=0 || index > size()) {
			return null;
		}
		
		Node<E> currentNode = this.head;
		for (int i =1;i< index;i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}
	
	public E removeTail() {
		if (this.isEmpty()) {
			return null;
		} else if (this.size() == 1){
			return this.clear();
		} else {
			Node<E> previousNode = this.head;
			for (int i =1;i<size()-1;i++) {
				previousNode = previousNode.getNext();
			}
			
			E returnData = get(this.size());
			previousNode.setNext(null);
			this.tail = previousNode;
			
			listSize--;
			return returnData;
		}
	}
	
	public E removehead() {
		if (isEmpty()) {
			return null;
		} else if (size() == 1) {
			return clear();
		} else {
			E headData = get(1);
			this.head = head.getNext();
			this.listSize--;
			return headData;
		}
	}
	
	public E removeAtIndex(int index) {
		if (index <=1) {
			return removehead();
		} else if (index >= size()) {
			return removeTail();
		} else {
			Node<E> previousNode = this.head;
			for (int i =1;i<index-1;i++){
				previousNode = previousNode.getNext();
			}
			E nodeData = previousNode.getNext().getData();
			previousNode.setNext(previousNode.getNext().getNext());
			listSize--;
			return nodeData;
		}
	}
}
