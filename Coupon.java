package FunctionalProgram;
import java.util.Scanner;
import Utility.Utility;
public class Coupon {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of Number of Coupons to be generated");
		int n = scan.nextInt();
		int[] coupons = Utility.couponGenerator(n);
		for (int i : coupons) {
			System.out.println(i);
		scan.close();
		}
	}
	public static int[] couponGenerator(int n) {
		int[] a = new int[n];
		boolean isDistinct = true;
		int randomNoCount = 0;
		int coupanCount = 0, k = 0;
		return null;
	}
}
