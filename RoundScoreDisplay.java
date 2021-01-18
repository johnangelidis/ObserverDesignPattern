package ObserverDesignPattern;

public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golf){
        this.golfer = golf;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }
    
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
            System.out.println("Made par");
        }
        System.out.println();
    }
}

