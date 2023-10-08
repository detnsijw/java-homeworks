package inheritance_examples;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Bulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb is off");
    }
}