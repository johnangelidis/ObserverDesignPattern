package ObserverDesignPattern;

public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golf){
        this.golfer = golf;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

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

