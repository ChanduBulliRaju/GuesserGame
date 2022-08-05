import java.util.Scanner;

public class Player {
	
        int pguessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		pguessNum=scan.nextInt();
		while(pguessNum>100)
		{
	         System.out.println("please enter a number between 1 to 100");
	         pguessNum=scan.nextInt();
		}
		return pguessNum;
	}

}
