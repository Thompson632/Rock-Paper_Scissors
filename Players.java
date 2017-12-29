import java.util.Scanner;
/*
Robert Thompson
Apr 2, 2015
CS-175
 */
public class Players
{
	private String name;
	private String selection;
	private int winner;
	private int loser;
	
	/**
	 * This method set the players inputted name and stores it in the String variable "name".
	 * @param playersName
	 */
	public void setName(String playersName)
	{
		name = playersName;
	}
	
	/**
	 * This method gets the inputted name of either: player one or player two.
	 * @return player one or player two which is stored in the variable int "name".
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * This method sets the players inputted answer and stores it in the String variable "selection".
	 * @param chosenAnswer
	 */
	public void setDecision(String chosenAnswer)
	{
		selection = chosenAnswer;
	}
	
	/**
	 * This method gets the inputted answer of either: player one or player two.
	 * @return player one or player two's answer which is stored in the String variable "selection".
	 */
	public String getDecision()
	{
		return selection;
	}
	
	/**
	 * This method gets the winner of the game which is determined by a switch statement in the class "Game".
	 * @return winner of the game
	 */
	public int getWinner()
	{
		return winner;
	}
	
	/**
	 * This method gets the loser of the game which is determined by a switch statement in the class "Game".
	 * @return loser of the game
	 */
	public int getLoser()
	{
		return loser;
	}
	
	/**
	 * This method allows for the winner to be altered. Meaning that in the "Game" class, the counter method will be able to add a win to the specific player.
	 * @param wins
	 */
	public void setWinner(int wins)
	{
		winner = wins;
	}
	
	/**
	 * This method allows for the loser to be altered. Meaning that in the "Game" class, the counter method will be able to add a loss to the specific player.
	 * @param losses
	 */
	public void setLoser(int losses)
	{
		loser = losses;
	}
	
}

