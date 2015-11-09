class Chef implements IContestant {
  String name;
  String cuisine;
  int twitterFollowers;
  
  Chef (String name, String cuisine, int twitterFollowers) {
    this.name = name;
    this.cuisine = cuisine;
    this.twitterFollowers = twitterFollowers;
  }
  public boolean isUnderdog () {
    return 200 > this.twitterFollowers ;
  }
  public boolean isNotYetKnown() {
    return false;
  }
}
