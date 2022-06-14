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
        // some implementation
    }

    @Override
    public void stop() {
        // some implementation
    }
    @Override
    public void fly() {
        throw new AssertionError("Cars cannot fly");
    }
}