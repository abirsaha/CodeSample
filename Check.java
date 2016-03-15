package abir.java.program;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int total = arr.length;
		int count = 0;
		
		for (int i=0;i< total;i++ ){
			System.out.println(arr[++i]);
			count++;
		}
		System.out.println(count);
		
		
	}

}
