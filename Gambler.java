package FunctionalProgram;
import Utility.Utility;
import java.util.Scanner;
public class Gambler {
		public static void main (String[] args){ 
	    	 Scanner scan = new Scanner(System.in);	     
	    	 System.out.print("enter player's stake");	     
	    	 int stake= scan.nextInt();
	    	 System.out.print("enter player's goal");	     
	    	 int goal= scan.nextInt();	     
	    	 System.out.print("enter player's trials");	     
	    	 int trials= scan.nextInt();	     
	    	 Utility.Gambling(stake,goal,trials);
	    	 scan.close();
	}
}
