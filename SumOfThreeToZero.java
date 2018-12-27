package FunctionalProgram;
import java.util.Scanner;
import Utility.Utility;
public class SumOfThreeToZero {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scan.nextInt();
		Utility.sumToZero(n);
		scan.close();
	}

}
