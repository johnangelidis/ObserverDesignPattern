package ObserverDesignPattern;
/**
 * Creates an observer that records a golfer's cumulative score for the round
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Creates a display of the score of the round given a golfer
     */
    public RoundScoreDisplay(Subject golf){
        this.golfer = golf;
        golfer.registerObserver(this);
    }

    /**
     * Method that updates the total strokes and total par for the round by adding the new values to the current values
     * @param strokes, par
     */
    @Override
    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }
    
    /**
     * Method that displays the round score by taking the difference between total par and total strokes; prints out whether the golfer is under, over, or is making par.
     */
    private void displayRoundScore(){
        System.out.println("Round stats:");
        System.out.println("Par: " + parTotal);
        System.out.println("Strokes: " + strokesTotal);
        int difference;
        if(parTotal>strokesTotal){
            difference = parTotal-strokesTotal;
            System.out.println(difference + " under par");
        }
        else if(parTotal<strokesTotal){
            difference = strokesTotal-parTotal;
            System.out.println(difference + " over par");
        }
        else{
            System.out.println("Making par");
        }
        System.out.println();
    }
}

