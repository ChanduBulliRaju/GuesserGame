
public class Umpire {
	

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	
	
	public void collectNumFromPlayer()
	{
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		System.out.println("Player1 kindly guess the number between 1 to 100");
		numFromPlayer1=p1.guessNumber();
		System.out.println("Player2 kindly guess the number between 1 to 100");
		numFromPlayer2=p2.guessNumber();
		System.out.println("Player3 kindly guess the number between 1 to 100");
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare()
	{
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	

}
