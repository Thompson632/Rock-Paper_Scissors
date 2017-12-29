import java.util.Scanner;
/*
Robert Thompson
Apr 2, 2015
CS-175
 */
public class Game
{
	Scanner scan = new Scanner(System.in);
	Players playerOne = new Players();
	Players playerTwo = new Players();
	
	String playersName, chosenAnswer;
	int playerOneInteger, playerTwoInteger;
	
	String runAgain = "yes";
	
	/**
	 * This method outputs the the name of the game.
	 */
	public void welcome()
	{
		//Welcomes the players to the game
		System.out.println("Welcome to Rock, Paper, Scissors!");
	}
	
	/**
	 * This method prompts the user for his or her name and choice of rock paper or scissors. 
	 * The scanner then reads the input and stores it in the specific variable.
	 */
	public void inputPlayerInformation()
	{
		//PLAYER ONE NAME
		//Prompts the first player to enter his or her name
		System.out.print("Player 1, please enter your name: ");
		//The scanner reads the inputted name and then converts the players name to all capital letters 
		playersName = scan.next().toUpperCase();
		//Stores the players name to player one 
		playerOne.setName(playersName);
		
		//PLAYER ONE SELECTION
		//Prompts player one to enter rock, paper, or scissors
		System.out.print(playerOne.getName() + ", please enter Rock, Paper, or Scissors: ");
		//The scanner reads the inputted selection and converts it to lower case letters
		chosenAnswer = scan.next().toLowerCase();
		//Stores the players selection to player one
		playerOne.setDecision(chosenAnswer);
		System.out.println();
		System.out.println(playerOne.getDecision());
		System.out.println();
		
		//PLAYER TWO NAME
		//Prompts the second player to enter his or her name
		System.out.print("Player 2, please enter your name: ");
		//The scanner reads the inputted name and then converts the players name to all capital letters 
		playersName = scan.next().toUpperCase();
		//Stores the players name to player two 
		playerTwo.setName(playersName);
		
		//PLAYER TWO SELECTION
		//Prompts player one to enter rock, paper, or scissors
		System.out.print(playerTwo.getName() + ", please enter Rock, Paper, or Scissors: ");
		//The scanner reads the inputted selection and converts it to lower case letters
		chosenAnswer = scan.next().toLowerCase();
		//Stores the players selection to player two
		playerTwo.setDecision(chosenAnswer);
		System.out.println();
		System.out.println(playerTwo.getDecision());

		
		System.out.println(playerOne.getName() + "'s Selection: " + playerOne.getDecision());
		System.out.println(playerTwo.getName() + "'s Selection: " + playerTwo.getDecision());
		System.out.println();
	}
	
	/**
	 * This method first returns the player one's selection and puts it into a switch statement.
	 * It then changes the player one's selection into an integer value. 
	 */
	public void playerOneChoice()
	{
		switch (playerOne.getDecision())
		{
			case "rock":
				playerOneInteger = 1;
				break;
			case "paper":
				playerOneInteger = 2;
				break;
			case "scissors":
				playerOneInteger = 3;
				break;
		}
		System.out.println(playerOneInteger);
	}
	
	/**
	 * This method first returns the player two's selection and puts it into a switch statement.
	 * It then changes the player two's selection into an integer value. 
	 */
	public void playerTwoChoice()
	{
		switch (playerTwo.getDecision())
		{
			case "rock":
				playerTwoInteger = 1;
				break;
			case "paper":
				playerTwoInteger = 2;
				break;
			case "scissors":
				playerTwoInteger = 3;
				break;
		}
		System.out.println(playerTwoInteger);
	}
	
	/**
	 * This method is used to determine the winner of the game.
	 * Each case is based upon the first player's selection and it then compares it to player two's selection.
	 * The winner out of the game is then outputted.
	 * The value of the counter method is then become "1" if player one wins and "2" if player two wins.
	 */
	public void winner()
	{
		switch (playerOneInteger)
		{
			case 0:
				{
					System.out.println("Invalid Input");
					break;
				}
	
			case 1: 
				if (playerTwoInteger == 0)
				{
					System.out.println("Invalid Input");
					break;
				}
				if (playerTwoInteger == 1)
				{
					System.out.println("It is a tie!");
				}
				else
				{
					if (playerTwoInteger == 2)
					{
						System.out.println("Paper beats Rock! " + playerTwo.getName() + " wins!");
						counter(2);
					}
					else
					{
						System.out.println("Rock beats Scissors! " + playerOne.getName() + " wins!");
						counter(1);
					}
				}	
				break;
				
			case 2: 
				if (playerTwoInteger == 0)
				{
					System.out.println("Invalid Input");
					break;
				}
				if (playerTwoInteger == 1)
				{
					System.out.println("Paper beats Rock! " + playerOne.getName() +" wins!");
					counter(1);
				}
				else
				{
					if (playerTwoInteger == 2)
					{
						System.out.println("It is a tie!");
					}
					else 
					{
						System.out.println("Scissors beats Paper! " +playerTwo.getName() + " wins!");
						counter(2);

					}
				}
				break;
				
			case 3:
				if (playerTwoInteger == 0)
				{
					System.out.println("Invalid Input");
				break;
				}
				if (playerTwoInteger == 1)
				{
					System.out.println("Rock beats Scissors! " + playerTwo.getName() + " wins!");
					counter(2);
				}
				else
				{
					if (playerTwoInteger == 2)
					{
						System.out.println("Scissors beats Paper! " + playerOne.getName() + " wins!");
						counter(1);
					}
					else
					{
						System.out.println("It is a tie!");
					}
				}
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	/**
	 * Method used to either at a win or a loss to the player's win/loss ratio
	 * @param winner
	 * @return winner, loser
	 */
	public void counter(int winner)
	{
		if (winner == 1)
		{
			playerOne.setWinner(playerOne.getWinner()+ 1);
			playerTwo.setLoser(playerTwo.getLoser()+ 1);
		}
		
		if (winner == 2)
		{
			playerTwo.setWinner(playerTwo.getWinner() + 1);
			playerOne.setLoser(playerOne.getLoser() + 1);
		}
	}
	
	/**
	 * This method is used to output the win/loss ratio for each player.
	 * The win loss ratio is outputted by displaying the user's name and then his or her wins:losses.
	 * @return winner, loser
	 */
	public void winLossRatios()
	{
		System.out.println(playerOne.getName()+"'s Win/Loss Ratio is "+playerOne.getWinner()+":"+playerOne.getLoser());
		System.out.println(playerTwo.getName()+"'s Win/Loss Ratio is "+playerTwo.getWinner()+":"+playerTwo.getLoser());
		System.out.println();
	}

	/**
	 * This method is used to hold all the methods that are used in the class. 
	 * It includes a method that is used to run the game again.
	 */
	public void startGame()
	{
		welcome();
		inputPlayerInformation();
		playerOneChoice();
		playerTwoChoice();
		winner();
		winLossRatios();
		playAgain();
	}
	
	/**
	 * This method is used to run the game again.
	 * The player(s) are asked if they would like to play again and the scanner reads the input.
	 * Depending on the decision, the program will run again.
	 */
	public void playAgain()
	{
		System.out.println("Would you like to play again? Yes or no?");
		runAgain = scan.next();
		while (runAgain.equals("yes"))
		{
			inputPlayerInformation();
			playerOneChoice();
			playerTwoChoice();
			winner();
			winLossRatios();
			playAgain();
		}
	}
}

