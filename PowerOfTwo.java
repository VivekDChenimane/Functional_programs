package FunctionalProgram;
import java.util.Scanner;
import Utility.Utility;
public class PowerOfTwo {
	
	public static void main(String args[]) {
		System.out.println("Enter the value of N");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int value[] = 	new int[n];
		for(int i=0;i<n;i++) {
			value[i]=Utility.powerValue(i);
			System.out.println(value[i]);
		}
		scan.close();
		
	}

}
