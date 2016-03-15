package abir.java.program;

public class CodilySum {
	
	public static void main(String args[]){
		int number = solution(17);
		System.out.println("Solution is "+number);
	}

	private static int solution(int i) {
		// TODO Auto-generated method stub
		int j;
		for (j=0;j< Math.sqrt(i);j++) {
			int m= j+2;
			if(m*(m+1)/2>i){
				return m-1;
				
			}
		}
		
		return -1;
	}

}
