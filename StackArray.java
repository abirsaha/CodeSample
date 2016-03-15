package abir.java.program;

public class StackArray<T> implements Stack<T> {

	private T[] arr;
	private int total;
	
	
	
	@SuppressWarnings("unchecked")
	public StackArray() {
		arr = (T[]) new Object[2];
	}

	@SuppressWarnings("unchecked")
	private void resize(int capacity) {
		T[] tmp =(T[]) new Object[capacity];
		System.arraycopy(arr, 0, tmp, 0, total);
		arr = tmp;
	}
	
	@Override
	public StackArray<T> push(T ele) {
		// TODO Auto-generated method stub
		if (arr.length == total) resize(arr.length*2);
		arr[total++] = ele;
		return this;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (total == 0) throw new java.util.NoSuchElementException();
		T ele = arr[--total];
		arr[total]= null;
		if (total >0 && total == arr.length/4) resize(arr.length/2);
		return ele;
	}
	
	@Override
	public String toString() {
		return java.util.Arrays.toString(arr);
	}
	
	public static void main(String args[]){
		Stack<String> greeting = new StackArray<>();

		greeting.push("!").push("World").push("Hello, ");

		System.out.println(greeting.toString());
		System.out.println(greeting.pop() + greeting.pop() + greeting.pop()); // Hello, World!
	}

}
