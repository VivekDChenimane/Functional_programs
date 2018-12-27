package FunctionalProgram;
import java.util.Scanner;
import Utility.Utility;
public class Quadratic {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("In the equation ax2+bx+c enter the value of a,b,c");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		Utility.getRoots(a,b,c);
		scan.close();
	}
}
