class CricketTeam implements IContestant {
  String country;
  String jerseyColor;
  int rank;
  
  CricketTeam (String country, String jerseyColor, int rank) {
    this.country = country;
    this.jerseyColor = jerseyColor;
    this.rank = rank;
  }
  public boolean isUnderdog () {
    return this.rank > 20 ;
  }
  public boolean isNotYetKnown() {
    return false;
  }
}

//for hascolorclash I do think that we can do it right now.
//I think we would need a helper function that allowed us to
//compare the two teams colors.
