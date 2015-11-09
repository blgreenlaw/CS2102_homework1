class Robot implements IContestant {
  String school;
  boolean hasCompetedBefore;
  String bestFeature;
  
  Robot (String school, boolean hasCompetedBefore,String bestFeature) {
    this.school = school;
    this.hasCompetedBefore = hasCompetedBefore;
    this.bestFeature = bestFeature;
  }
  public boolean isUnderdog () {
    return this.hasCompetedBefore == false && this.bestFeature == "pogo sticks" ;
  }
  public boolean isNotYetKnown() {
    return false;
  }
}
