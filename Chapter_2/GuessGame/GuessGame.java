import java.util.Scanner;

class GuessGame {
	private static final int NUM_PLAYERS = 3;
	private static final int MAX_NUMBER = 10;
  private Player[] players;

  public void startGame() {
  	Scanner scanner = new Scanner(System.in);
  	players = new Player[3];

  	for (int i = 0; i < players.length; i++) {
  		players[i] = new Player(i);
  	}

  	int[] winners = new int[NUM_PLAYERS];
  	int winnerCount = 0;
  	boolean gameRunning = true;

    System.out.println("Starting game...");

    int targetNumber = (int) (Math.random() * MAX_NUMBER);
    int currentPlayerId;
    System.out.println("Guess the number between 0 and 9...");
    while (gameRunning) {
    	for (int i = 0; i < players.length; i++) {
    		currentPlayerId = players[i].getId();
	      System.out.print("Enter guess for P"+currentPlayerId+": ");
	      players[i].setGuess(scanner.nextInt());
	      if (players[i].getGuess() == targetNumber) {
	      	winners[winnerCount] = currentPlayerId;
	      	winnerCount++;
	      }
    	}

    	System.out.println();
    	if (winnerCount == 0) {
    		System.out.println("The winner is...");
    		System.out.println("No one yet!\n");
    	} else if (winnerCount == 1) {
    		System.out.println("The winner is...");
    		System.out.println("Player "+winners[0]+"!");
    		System.out.println("Thanks for playing!");
    		gameRunning = false;
    	} else {
    		System.out.println("The winners are...");
	    	for (int i = 0; i < winnerCount; i++) {
	    		System.out.print("Player "+winners[i]);
	    		if (i != winnerCount-1) {
	    			System.out.print(" and ");
	    		}
	    	}
	    	System.out.println();
    		System.out.println("Thanks for playing!");
    		gameRunning = false;
    	} 
    }
  }
}