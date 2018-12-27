package FunctionalProgram;
import Utility.Utility;
import java.util.Scanner;
public class Distance {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x-axis and y-axis");
		int x = scan.nextInt();
		int y = scan.nextInt();
		Utility.Euclidean(x,y);
		scan.close();
	}

}
