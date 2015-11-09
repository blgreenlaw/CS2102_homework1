class InitMatch implements ITournament {
  MatchData data;
  
  InitMatch (MatchData data) {
    this.data = data;
  }
  public int countUnderdogWins () {
    if (this.data.winner.isUnderdog()) {
      return 1;
    } else {
      return 0;
    }
  }
  public boolean winnersAlwaysPlayed () {
   return this.data.winnerPlayed();
  }
  public boolean anySkippedMatches () {
    if (this.data.winner.isNotYetKnown()) {
      return true;
    } else {
      return false;
  }
  }
}