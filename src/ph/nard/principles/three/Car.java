package ph.nard.principles.three;

public class Car implements Vehicle {
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void fly() {
    }
}