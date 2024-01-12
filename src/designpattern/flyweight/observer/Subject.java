package designpattern.flyweight.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setData(float temperature, float pressure);
}
