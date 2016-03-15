package abir.java.program;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int binaryNumber = Integer.parseInt(sc.nextLine(),2);
		System.out.println("Decimal equivalent -"+binaryNumber);
		sc.close();

	}

}
