package abir.java.program;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1 };
		//int[] sortedArrayB = bubbleSort(arr);
		int[] sortedArrayI = insertionSort(arr);
		int[] sortedArrayS = selectionSort(arr);
//		for (int i = 0; i < sortedArrayB.length; i++) {
//			System.out.print(sortedArrayB[i] + " ");
//		}
		System.out.println();
		for (int i = 0; i < sortedArrayI.length; i++) {
			System.out.print(sortedArrayI[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < sortedArrayS.length; i++) {
			System.out.print(sortedArrayS[i] + " ");
		}
		
	}

	private static int[] bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int i, j, temp = 0;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private static int[] insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int i, j, key, temp;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && key < arr[j]) {

				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}
		}

		return arr;
	}
	
	private static int[] selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int i, j, minVal,minIndex, temp=0;
		for (i = 0; i < arr.length; i++) {
			minVal= arr[i];
			minIndex = i;

			for(j=i;j<arr.length;j++){
				if(arr[j]<minVal){
					minVal = arr[j];
					minIndex = j;
				}
			}
			
			if(minVal < arr[i]){
				temp= arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i] = temp;
			}
		}

		return arr;
	}
}
