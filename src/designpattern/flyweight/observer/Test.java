package designpattern.flyweight.observer;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new WeatherData();
        subject.registerObserver(new HuadiaoWebsite());

        subject.setData(37.5f, 1000.0f);

    }
}
