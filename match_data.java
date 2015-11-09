class MatchData {
  IContestant side1;
  IContestant side2;
  IContestant winner;
  
  MatchData (IContestant side1, IContestant side2, IContestant winner) {
    this.side1 = side1;
    this.side2 = side2;
    this.winner = winner;
  }
  //this method tells if a winner is from side1 or side2
  public boolean winnerPlayed () {
    if (this.winner == this.side1) {
      return true;
    } else if (this.winner == this.side2) {
      return true;
    } else {
      return false;
    }
  }
  //this method tells if the winner is an underdog
  public boolean underdogWin () {
    if (this.winner.isUnderdog() ) {
      return true;
  } else {
    return false;
  }
}
}