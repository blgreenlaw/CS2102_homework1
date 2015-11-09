import tester.*;

public class Main {
        static Examples E = new Examples () ;

 public static void main(String[] args) {
  // Create samples of each contestant
  CricketTeam cricketTeam = new CricketTeam("India", "blue", 35);
  Chef chef = new Chef("Gordon Ramsay", "French", 2180000);
  Robot robot = new Robot("WPI", true, "lasers");
  NotYetKnown unknown = new NotYetKnown();

  // Call methods through interface on all contestants
  boolean result;
  result = ((IContestant) cricketTeam).isUnderdog();
  result = ((IContestant) chef).isUnderdog();
  result = ((IContestant) robot).isUnderdog();
  result = ((IContestant) unknown).isUnderdog();

  // Create samples of tournaments
  MatchData data = new MatchData(robot, robot, unknown);
  InitMatch initMatch = new InitMatch(data);
  AdvanceMatch advanceMatch = new AdvanceMatch(data, initMatch, (ITournament) initMatch);

  // Call methods through interface on all tournaments
  int count;
  count = ((ITournament) initMatch).countUnderdogWins();
  count = ((ITournament) advanceMatch).countUnderdogWins();
  result = ((ITournament) initMatch).winnersAlwaysPlayed();
  result = ((ITournament) advanceMatch).winnersAlwaysPlayed();
  result = ((ITournament) initMatch).anySkippedMatches();
  result = ((ITournament) advanceMatch).anySkippedMatches();

  // Run the Examples class
  Tester.run(E);
 }
}