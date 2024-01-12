package designpattern.flyweight.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void setData(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers) {
            observer.update(this.temperature, this.pressure);
        }
    }
}
