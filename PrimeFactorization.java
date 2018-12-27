package FunctionalProgram;
import java.util.Scanner;
import Utility.Utility;
public class PrimeFactorization { 
	public static void main (String args[]) 
    { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
        int n = scan.nextInt(); 
        Utility.primeFactors(n); 
        scan.close();
    } 

}
