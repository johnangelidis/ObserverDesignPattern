package ObserverDesignPattern;
import java.util.ArrayList;

public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    public Golfer(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    
    public void enterScore(int strokes, int par) {
        for(Observer ob:observers){
            ob.update(strokes, par);
        }

    }
    
    public String getName(){
        return name;
    }

    
}

