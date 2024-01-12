package designpattern.flyweight.observer;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class HuadiaoWebsite implements Observer {
    private float temperature;
    private float pressure;

    @Override
    public void update(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

        System.out.println("获取温度为" + temperature);
        System.out.println("获取压强为" + pressure);
    }
}
