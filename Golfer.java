package ObserverDesignPattern;
import java.util.ArrayList;
/**
 * Class that creates a golfer to be used as the subject
 */
public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Creates a new golfer with a given name
     * @param name
     */
    public Golfer(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Method that registers an observer by adding them to the ArrayList
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    /**
     * Method that removes an observer by removing them from the ArrayList
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    /**
     * Updates the golfer's strokes and par given new values
     * @param strokes, par
     */
    public void notifyObservers(int strokes, int par) {
        for(Observer ob:observers){
            ob.update(strokes, par);
        }

    }

    /**
     * Notifies the observer's that the golfer's score has changed
     * @param strokes, par
     */
    public void enterScore(int strokes, int par){
        notifyObservers(strokes,par);
    }



    /**
     * Method that returns the name of the golfer
     * @return The name of the golfer
     */
    public String getName(){
        return name;
    }

    
}

