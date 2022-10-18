package game;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * @author FNERON
 * Implements the game for a football.
 * 
 */
public class Football implements IGame {

    public static enum State {
        START, PLAYING ,END
    }

    private final static Logger LOGGER = Logger.getLogger(Football.class.getName());

    private String awayTeam;
    private String homeTeam;

    private int awayScore;
    private int homeScore;

    private Map<Integer, String> goalAwayTeam;
    private Map<Integer, String> goalHomeTeam;

    private State state;

    /**
     * Constructor
     */
    public Football(){
        reset();
    }

    /**
     * Start a new game
     * @param String awayTeam, String homeTeam
     * @return String message
     */
    @Override
    public String start(String awayTeam, String homeTeam) {
        reset();

        state = State.START;

        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;

        return String.format("%s %d vs. %s %d\n", this.awayTeam, awayScore, this.homeTeam, homeScore);

    }

    /**
     * Print the current game info.
     * @return String message
     */
    @Override
    public String print() {
        if (state == State.END) {
            return "No game currently in progress";
        }

        return printInfo();
    }

    /**
     * Adds a goal to the game.
     * @param int minutes, String team, String player
     * @return String message
     */
    @Override
    public String score(int minutes, String team, String player) {
        if (state == State.END) {
            return "No game currently in progress";
        }

        state = State.PLAYING;

        if(this.awayTeam.equals(team)) {
            awayScore++;
            goalAwayTeam.put(minutes, player);
        }

        if(this.homeTeam.equals(team)) {
            homeScore++;
            goalHomeTeam.put(minutes, player);
        }

        return "Goal!!!\n" + printInfo();
    }

    /**
     * Finish the game.
     * @return String message
     */
    @Override
    public String end() {
        if(state == State.END) {
            return "No game currently in progress";
        }

        String info = printInfo();

        state = State.END;
        reset();

        return "The game has ended!\n" + info;  
    }

    /**
     * Will return the current info on the football game as a String.
     * TODO: Use the StringBuffer for optimization.
     * @return String info
     */
    public String printInfo(){

        String string = awayTeam + " " + awayScore + " ";

        if (!goalAwayTeam.isEmpty()){
            string += "(";
            for (Map.Entry<Integer, String> entry : goalAwayTeam.entrySet()) {
                string += entry.getValue() + " " + entry.getKey() + "' ";
            }
            string = string.substring(0, string.length() -1);
            string += ")";
        }

        string += " vs. " + homeTeam + " " + homeScore + " ";

        if (!goalHomeTeam.isEmpty()){
            string += "(";
            for (Map.Entry<Integer, String> entry : goalHomeTeam.entrySet()) {
                string += entry.getValue() + " " + entry.getKey() + "' ";
            }
            string = string.substring(0, string.length() -1);
            string += ")";
        }

        return string;
    }

    /**
     * Handles the invalid input on state.
     * @return String message
     */
    @Override
    public String invalid() {
        if((state == State.START || state == State.PLAYING )) {
            return " 'input error - please type 'print' for game details'.";
        }
        else
            return " 'input error - please start a game through typing 'Start:'<Name of Home Team>' vs. '<Name of Away Team>''.";
    }

    /**
     * Reset the game to a new one.
     */
    public void reset() {
        awayTeam = "";
        homeTeam = "";
        awayScore = 0;
        homeScore = 0;
        goalAwayTeam = new TreeMap<Integer, String>();
        goalHomeTeam = new TreeMap<Integer, String>();
        state = State.END;
    }

    public State getState() {
        return state;
    }
}
package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import command.ICommand;
import command.InvalidCommand;
import command.PrintCommand;
import command.ScoreCommand;
import command.StartCommand;
import command.StopCommand;
import game.IGame;

/**
 * @author FNERON
 * Handles parsing from string inputs. Acts as a model.
 * Command and creation factory.
 */
public final class GameParser {

    private String awayTeam;
    private String homeTeam;

    private String team;
    private int minutes;
    private String player;

    private IGame game;

    /**
     * Constructor
     * @param IGame game
     */
    public GameParser(IGame game) {
        this.game = game;
    }

    /**
     * Depending inputs handle the creation of commands.
     * @param String string
     * @return ICommand command
     */
    public ICommand parse(String string) {
        if(Pattern.matches("^Start: '(.+)' vs. '(.+)'$", string)) {
            Pattern r = Pattern.compile("Start: '(.+)' vs. '(.+)'$"); 

            Matcher m = r.matcher(string);

            while (m.find()) {
                awayTeam = m.group(1);
                homeTeam = m.group(2);
            }

            return new StartCommand(game, this);
        }
        else if(Pattern.matches("^(\\d+) '(.+)' (.+)$", string)) {
            Pattern pattern = Pattern.compile("(\\d+) '(.+)' (.+)");
            Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                minutes = Integer.parseInt(matcher.group(1));
                team = matcher.group(2);
                player = matcher.group(3);
            }

            return new ScoreCommand(game, this);
        }
        else if(string.equals("print")) {
            return new PrintCommand(game);
        }
        else if(string.equals("end")) {
            return new StopCommand(game);
        }
        else
            return new InvalidCommand(game);
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getTeam() {
        return team;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getPlayer() {
        return player;
    }
}
package Application;

import Swing.Scoreboard;
import game.Football;
import parser.GameParser;


//TODO Can we handle multiple game at once ?
//TODO Do we have to take for granted that it's a score board only for football?
//TODO Add a timer to end game after 80 minutes. Not specified in problems. (Thread)
//TODO Ask more question about the game definitions (level of abstractions)
//TODO Ask for more corner case and refined current corner case.

/**
 * Develop an application that prints out a scoring dashboard as text during a football match.
 * @author FNERON
 * Possible inputs
 * 1)   Start: '<Name of Home Team>' vs. '<Name of AwayTeam>'
 * 2)   <minute> '<Team>' <name of scorer>
 * 3)   print
 * 4)   end
 */
public class ScoreboardApplication {

    public static void main(String[] args) {

        Football footBall = new Football();
        GameParser gameParser = new GameParser(footBall);

        Scoreboard window = new Scoreboard(gameParser);
        window.setVisible(true);
    }
}
