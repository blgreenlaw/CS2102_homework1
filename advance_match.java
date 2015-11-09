class AdvanceMatch implements ITournament {
  MatchData data;
  ITournament tournament1;
  ITournament tournament2;
  
  AdvanceMatch (MatchData data, ITournament tournament1, ITournament tournament2) {
    this.data = data;
    this.tournament1 = tournament1;
    this.tournament2 = tournament2;
  }
    public int countUnderdogWins () {
     int wins=(this.tournament1.countUnderdogWins() + this.tournament2.countUnderdogWins()) ;
      if (this.data.winner.isUnderdog()) {
        return 1 + wins;
      } else {
        return wins;
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
  