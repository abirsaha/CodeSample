package abir.java.program;

import java.util.Arrays;
 // Reverse array implementation in O(n)
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,5,3,2,1};
		reverse(arr);
	}
	
	public static void  reverse(int []input){
		System.out.println("Original Array"+Arrays.toString(input));
		if (input == null || input.length <=1) {
			return;
		} else {
			for (int i =0;i<input.length/2;i++){
				int temp = input[i];
				input[i] = input[input.length-i-1];
				input[input.length-i-1] = temp;
			}
			System.out.println("Reversed Array"+Arrays.toString(input));
		}
		
	}

}
