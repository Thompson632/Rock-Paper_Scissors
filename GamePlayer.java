/*
Robert Thompson
Apr 2, 2015
CS-175
 */
//ALGORITHM FOR THE GAME
//Welcome the user
//Prompts the user for their name and their choice of rock, paper, or scissors
//Program converts rock to integer "1", paper to integer "2", and scissors to integer "3"
//Then changes each players selection to the specific integer
//The program will then move to a method that will run three test cases based upon player one's selection
//Each test cases runs a nest if/else statement that will determine the winner
//In this method, also, the counter will be set to "1" or "2" depending on the winner of the game
//The next method will have two if statement for the countering equal to "1" or "2"
//The counter method will get the winner and 1 to it
//The counter method will get the loser and add 1 to it
//The following method will then output the win/loss ratio for both players
//Another method, startGame, includes all the methods in the "Game" class and will be ran in the "GamePlayer" class
//A "playAgain" method is also included which prompts the user to see if he/she wants to play again
//If their answer is yes, the program will run over excluding the "welcome" method
//If their answer is no, the program will end

//ALGORITHM FOR THE WINNER
//Switch statement that begins with playerOneInteger, which is either rock, paper, or scissors
//Three test cases, which have three different test cases inside of them that are shown in a nested if/else statement
//After the specific test case is entered and then run, the system will print out the winner and which selection beat what
//If the user enters something other than rock, paper, or scissors, the program will print out "Invalid Input"

//TEST CASES FOR THE WINNER
//Input P1: rock and P2: rock
//Output: Tie
//Input P1: rock and P2: paper
//Output: P2 Wins - paper beats rock
//Input P1: rock and P2: scissors
//Output: P1 Wins - rock beats scissors

//Input P1: paper and P2: paper
//Output: Tie
//Input P1: paper and P2: rock
//Output: P1 Wins - paper beats rock
//Input P1: paper and P2: scissors
//Output: P2 Wins - scissors beats paper

//Input P1: scissors and P2: scissors
//Output: Tie
//Input P1: scissors and P2: rock
//Output: P2 Wins - rock beats scissors
//Input P1: scissors and P2: paper
//Output: P1 Wins - scissors beats paper

//Input P1: rok and P2: paper
//Output: Invalid Input

public class GamePlayer
{

	public static void main(String[] args)
	{
		Game rockPaperScissors = new Game();
		rockPaperScissors.startGame();
	}

}

