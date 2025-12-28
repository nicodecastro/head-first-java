class Player {
  private int id;
  private int guess;

  public Player(int id) {
    this.id = id;
  }

  int getId() {
    return this.id;
  }

  void setGuess(int guess) {
  	this.guess = guess;
  }

  int getGuess() {
  	return this.guess;
  }
}