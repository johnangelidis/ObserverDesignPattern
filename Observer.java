package ObserverDesignPattern;
/**
 * Interface to create observers
 */
public interface Observer {
    /**
     * Method that updates the strokes and par given new values
     * @param strokes, par
     */
    public void update(int strokes, int par);
}

