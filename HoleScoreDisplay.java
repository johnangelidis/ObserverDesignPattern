package ObserverDesignPattern;
/**
 * Creates an observer that records the golfer's score for every hole
 */
public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Creates a display of the score for each hole given a golfer
     * @param golf
     */
    public HoleScoreDisplay(Subject golf){
        this.golfer = golf;
        golfer.registerObserver(this);
    }

    /**
     * Method that updates the strokes and par for every hole given the new vaules and displays the new score
     * @param strokes, par
     */
    @Override
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * Method that displays the golfer's score for the hole; it takes the difference of the par and the strokes and prints whether it was under, over, or made par.
     */
    private void displayCurrentScore(){
        System.out.println("Current Hole stats:");
        System.out.println("Par: " + par);
        System.out.println("Strokes: " + strokes);
        int difference;
        if(par>strokes){
            difference = par-strokes;
            System.out.println(difference + " under par");
        }
        else if(par<strokes){
            difference = strokes-par;
            System.out.println(difference + " over par");
        }
        else{
            System.out.println("Made par");
        }
        System.out.println();
    }
    
}

