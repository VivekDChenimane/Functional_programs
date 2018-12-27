package FunctionalProgram;
import Utility.Utility;
import java.util.Scanner;

public class HeadTail {
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of times to flip a coin");
			int flip = scan.nextInt();
			Utility.flip(flip);
			scan.close();
		}
	
}
	