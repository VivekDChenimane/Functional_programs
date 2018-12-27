package Utility;
import java.util.Random;
import java.util.Scanner;
public class Utility {
	public static void Gambling(int stake, int goal, int trials){
		int loss=0;
		int bets=0;
		int wins=0;
		for (int t = 0 ; t < trials ; t++) {						
			int cash = stake;					
			while (cash > 0 && cash < goal) {
					bets++;		
				if (Math.random() < 0.5)
					cash++;
				else							
					cash--;            
			}
			if (cash == goal)
				wins++;							
			else	        	
				loss++;
						
		}
		System.out.println(wins + " wins of " + trials);
		double won= ( 100.0 * wins )  / trials;			
		System.out.println("Percent of games won = "+ won);
		System.out.println(loss +" loss of " + trials );
		double lose =( 100.0 * loss ) / trials;
		System.out.println("Percent of games lose = "+ lose);
		System.out.println("Number of bets: "+ bets);	
		}
	
	
		public static boolean leap(int year) {
			if( year%400==0 || year%4==0 && year%100!=0 )
				return true;
			else
				return false;
		}
		public static int powerValue(int n) {
			if(n==0)
				return 1;
			else
				return 2*powerValue(n-1);
		}
		
		
	public static void flip(int flip){
		int head = 0;
		int tail = 0;
		double a[] = new double[flip];
		if(flip<0)
			System.out.println("Enter the proper value");
		else
			for(int i=0;i<flip;i++)
				a[i]=Math.random();	
			for(int i=0;i<flip;i++){
			if(a[i]<0.5)
				tail++;
			else
				head++;
			}
		double headperc = (head*100)/flip;
		double tailperc = (tail*100)/flip;		
		System.out.println("Head perc:"+headperc);
		System.out.println("Tail perc:"+tailperc);
	}
	
	
	public static double harmonicFunc(int n) {
		double sum=0.0;
		if(n>0) {
			sum = (1.0/n)+harmonicFunc(n-1);
			System.out.println(sum);
		}
		return sum;
	}
	
	public static void primeFactors(int n) 
    { 
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
        if (n > 2) 
            System.out.print(n); 
    }


	public static Object[][] intArray(int m,int n) {
		Object[][] input2DArray = new Object[m][n];
		System.out.println("Now enter values");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				input2DArray[i][j] = scan.nextInt();
			}
		}
		scan.close();
		return input2DArray;	
	}
	public static Object[][] doubleArray(int m,int n) {
		Object[][] input2DArray = new Object[m][n];
		System.out.println("Now enter values");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				input2DArray[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		return input2DArray;	
	}
	public static Object[][] booleanArray(int m,int n) {
		Object[][] input2DArray = new Object[m][n];
		System.out.println("Now enter values");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				input2DArray[i][j] = scan.nextBoolean();
			}
		}
		scan.close();
		return input2DArray;	
	}
	
	public static int randomNumber(int n) {
		Random rand = new Random();
		int value= rand.nextInt(n);
		return value;
	}
	
	
	public static void sumToZero(int n) {
		int a[] = new int[n];
		int count = 0;
		System.out.println("Enter "+n+" values");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<n;i++) 
			a[i] = scan.nextInt();
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
					if(a[i]+a[j]+a[k]==0) {
						System.out.println(a[i]+","+a[j]+","+a[k]+".");
						count++;
					}
		System.out.println("The number of trilets who's sum is equal to 0 is "+count);
		scan.close();
	}


	public static void Euclidean(int x, int y) {
		double value = Math.sqrt(x*x+y*y);
		System.out.println(value);
	}
	
	
	public static void getRoots(int a, int b, int c) {
		int delta = (b*b)-(4*a*c);
		double root1 = (-b+(Math.sqrt(delta))/(2*a*c));
		double root2 = (-b-(Math.sqrt(delta))/(2*a*c));
		System.out.println("Root1="+root1+".");
		System.out.println("Root2="+root2+".");
	}

}
