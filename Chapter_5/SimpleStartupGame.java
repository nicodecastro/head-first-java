import java.util.Scanner;

public class SimpleStartupGame {
	public static void main(String [] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleStartup theStartup = new SimpleStartup();

		int randomStart = (int) (Math.random() * 4);
		int[] locations = {randomStart, randomStart+1, randomStart+2};
		theStartup.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			int guess = helper.getUserInput("Enter a number: ");
			String result = theStartup.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.print("You took " + numOfGuesses + " guesses");
			}
		}
	}
}