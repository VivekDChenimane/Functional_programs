package FunctionalProgram;
import java.util.Scanner;
import Utility.Utility;
public class LeapYear {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		boolean i = Utility.leap(year);
		if(i)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
		scan.close();
	}
}
