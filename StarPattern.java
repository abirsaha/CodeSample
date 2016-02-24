import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StarPattern
{
/*
Drawing star pattern for user input 
for n =4:
*******
 *****
  ***
   *
*/
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Number daalo");
		int n = sc.nextInt();
		System.out.println(n);
		for(int j=n; j > 0;j--){
			for (int m=n-j;m>0;m--) {
				System.out.print(" ");
			}
			for (int p =2*j-1;p>0;p--){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}