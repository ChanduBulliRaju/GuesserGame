import java.util.Scanner;

public class Guesser {
	
     int guessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number between 1 to 100");
		guessNum=scan.nextInt();
		while(guessNum>100)
		{
	         System.out.println("please enter a number between 1 to 100");
	         guessNum=scan.nextInt();
		}
		

		return guessNum;	
	}	

}
