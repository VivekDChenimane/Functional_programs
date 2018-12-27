package FunctionalProgram;
import java.util.Scanner;
import Utility.Utility;
public class HarmonicNumber {
	
	public static void main(String args[]) {
		System.out.println("Enter the value of N");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double value = Utility.harmonicFunc(n);
		System.out.println("The harmonic value of "+n+" is:"+value);
		scan.close();
	}
}
