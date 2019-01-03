package FunctionalProgram;
import java.util.Scanner;
import java.util.Random;
//import Utility.Utility;
public class TicTacToe {
	static String game[][] = new String[3][3];
	static Scanner scan = new Scanner(System.in);

	public static void intializeGame()
	{
		for(int i=0;i<=2;i++)
			for(int j=0;j<=2;j++)
				game[i][j]="-";
	}
	
	public static int random() {
		Random rand = new Random();
		int value = rand.nextInt(3);
		System.out.println(value);
		return value;
	}
	
	//public static int
	
	public static void mark(int x,int y,String value)
	{
		if(game[x][y].equals("-")) 
			game[x][y] = value;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
				System.out.print(game[i][j]);
			System.out.println();
		}
		//check(value);
	}
	
	public static void computerPlayer() {
		boolean flag = false;
		while(flag==false) {
			int x = random();
			int y =random();
			if(game[x][y].equals("-")) 
			{
				mark(x,y,"O");
				flag = true;
			}
		}
	}
	
	public static void userPlayer() {
		boolean flag = false;
		while(flag==false)
		{
			System.out.println("Enter the row value:");
			int x = scan.nextInt(3); 
			System.out.println("Enter the column value:");
			int y = scan.nextInt(3);
			if(game[x][y].equals("-")) 
			{
				mark(x,y,"X");
				flag=true;
			}
			else
				System.out.println("Please enter the correct choice");
		}
	}
	
	
	public static void main(String args[]) 
	{
		intializeGame();
		System.out.println("Let computer be player 1(O)_and you be the player 2(X)");
		System.out.println("Ready for the game:-)");
		int count = 1;
		while(count<9) 
		{
			computerPlayer();
			count++;
			if(count==9)
			{
				System.out.println("Oh oo, The match is draw");	
				break;
			}
			userPlayer();
			count++;
		}
	}
}
