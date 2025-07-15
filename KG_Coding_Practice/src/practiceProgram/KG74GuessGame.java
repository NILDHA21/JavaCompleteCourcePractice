package practiceProgram;

import java.util.Scanner;

/*74. Create a number guessing game where the program selects a random number, 
 * and the user has to guess it.*/

public class KG74GuessGame {
	
	int random;
	
	KG74GuessGame(){
		random = (int)Math.ceil(Math.random()*100);
	}
	
	int guess(int guessNumber) {
		return guessNumber - random;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KG74GuessGame game = new KG74GuessGame();
		System.out.println("Welcome to the guessing game. Guess the number between 1-100.\n");
		int guess;
		int result;
		do {
			System.out.print("Guess the number: ");
			guess = sc.nextInt();
			result = game.guess(guess);
			if(result == 0) {
				System.out.println("Congrats, your guess is correct.");
			}else if(result < 0) {
				System.out.println("Please guess higher.");
			}else {
				System.out.println("Please guess lower.");
			}
		}while(result!=0);
	}
  
}
