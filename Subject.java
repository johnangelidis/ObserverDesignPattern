package ObserverDesignPattern;
/**
 * Interface used to create subjects to be observed
 */
public interface Subject{
    /**
     * Method that registers a given observer
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * Method that removes a given observer
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * Method that updates the strokes and par of a golfer
     * @param strokes, par
     */
    public void notifyObservers(int strokes, int par);
}