import tester.*;
class Examples {
   CricketTeam England = new CricketTeam ("England", "Blue and White", 37);
   CricketTeam Spain = new CricketTeam ("Spain", "Red and White", 7);
   CricketTeam Germany = new CricketTeam ("Germany", "Black and White", 14);
   CricketTeam Italy = new CricketTeam ("Italy", "Green and White", 24);
   Chef Flay = new Chef ("Bobby Flay", "American", 1210000);
   Robot Dino = new Robot ("WPI", true, "super speed");
   NotYetKnown unknown = new NotYetKnown ();
   MatchData Match1 = new MatchData (England, Spain, England);
   MatchData Match2 = new MatchData (Germany, Italy, Germany);
   MatchData Match3 = new MatchData (Germany, England, England); 
   MatchData Match4 = new MatchData (Spain, Italy, Italy);
   MatchData Match5 = new MatchData (Spain, unknown, unknown);
   MatchData Match6 = new MatchData (Spain, Germany, unknown);
   InitMatch Game1 = new InitMatch (Match1);
   InitMatch Game2 = new InitMatch (Match2);
   InitMatch Game3 = new InitMatch (Match3);
   AdvanceMatch Game4 = new AdvanceMatch (Match2, Game1, Game2);
   AdvanceMatch Game5 = new AdvanceMatch (Match5, Game3, Game2);
  //isUnderdog test cases       
   boolean test1(Tester t) {
     return t.checkExpect(England.isUnderdog(), true);
   }
   boolean test2(Tester t) {
     return t.checkExpect(Flay.isUnderdog(), false);
   }
   boolean test3(Tester t) {
     return t.checkExpect(Dino.isUnderdog(), 1);
   }
 //isNotYetKnown test cases  
    boolean test4(Tester t) {
     return t.checkExpect(Dino.isNotYetKnown(), false);
    }
     boolean test5(Tester t) {
     return t.checkExpect(unknown.isNotYetKnown(), true);
    }
    boolean test6(Tester t) {
     return t.checkExpect(Germany.isNotYetKnown(), false);
    }  
   //countUnderdogWins test cases
     boolean test7(Tester t) {
     return t.checkExpect(Game1.countUnderdogWins(), 1);
    }
      boolean test8(Tester t) {
     return t.checkExpect(Game2.countUnderdogWins(), 0);
    }
      boolean test9(Tester t) {
     return t.checkExpect(Game3.countUnderdogWins(), 2);
    }
    //winnersAlwaysPlayed test cases
       boolean test10(Tester t) {
     return t.checkExpect(Game5.winnersAlwaysPlayed(), true);
    }
       boolean test11(Tester t) {
     return t.checkExpect(Game4.winnersAlwaysPlayed(), false);
    }
    //anySkippedMatches test cases
          boolean test12(Tester t) {
     return t.checkExpect(Game2.anySkippedMatches(), false);
    }
          boolean test13(Tester t) {
     return t.checkExpect(Game5.anySkippedMatches(), true);
    }
    //winnerPlayed test cases
          boolean test14(Tester t) {
     return t.checkExpect(Match2.winnerPlayed(), true);
    }
          boolean test15(Tester t) {
     return t.checkExpect(Match6.winnerPlayed(), false);
    }
    //underdogWin test cases
           boolean test16(Tester t) {
     return t.checkExpect(Match1.underdogWin(), true);
    }
           boolean test17(Tester t) {
     return t.checkExpect(Match2.underdogWin(), false);
    }
}

//Brianna Greenlaw