package abir.java.program;

public class LinkedListTest {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> test = new LinkedList<Integer>();
		test.insert(12);
		test.insert(13);
		System.out.println("Print Linkedlist"+test.toString());
		test.addAfterIndex(3, 1);
		System.out.println("Print Linkedlist"+test.toString());
		test.removeTail();
		System.out.println("Print Linkedlist"+test.toString());
		
		
	}

}
