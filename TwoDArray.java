package FunctionalProgram;
import Utility.Utility;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of row and column");
		int m = scan.nextInt();
		int n = scan.nextInt();
		Object[][] obj = new Object[m][n];
		System.out.println("Enter 1->Integer,2->Double,3->Boolean");
		int i = scan.nextInt();
		if(i>0 && i<4) {
			switch(i) {
			case 1 : obj = Utility.intArray(m, n);
						break;
			case 2 : obj = Utility.doubleArray(m,n);
						break;
			case 3 : obj = Utility.booleanArray(m,n);
						break;
			}
		}
		for(int u=0;u<m;u++)
			for(int v=0;v<n;v++)
				System.out.println(obj[u][v]);
		scan.close();
	}
}