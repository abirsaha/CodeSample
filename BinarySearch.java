package abir.java.program;

import java.util.Scanner;

public class BinarySearch {
public static void main(String args[]){
 final int arr[] ={56,94,12,1212,33};
 Scanner sc = new Scanner(System.in);
 System.out.println("Number ofelements you want to find");
 int count = sc.nextInt();
 for(int i =0;i<count;i++){
 System.out.println("Enter the element you wish to find");
 int key = sc.nextInt();
 int index = binarySearch(arr,key,arr.length);
 if(index != -1){
 System.out.println("Item "+key+ " is found at location "+(index+1)+" in the array");
 }
 }
 sc.close();
}

private static int binarySearch(int[] arr, int key, int length) {
	// TODO Auto-generated method stub
	int first = 0;
	int last = length -1;
	int middle = (first+last)/2;
	while(first<last){
	if(arr[middle]<key){
		first=middle+1;
	} else if(arr[middle]==key){
		return middle;
	} else {
		last= middle-1;
	}
	middle = (first+last)/2;
	}
	if(first>last) {
		System.out.println("Item is missing in the array");
		return -1;
	}
	return middle;
	
}
}