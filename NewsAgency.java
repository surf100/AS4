import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String headline;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(headline);
        }
    }

    public void setHeadline(String headline) {
        this.headline = headline;
        notifyObservers();
    }
}
