package ph.nard.principles.two;

public class MotorCar implements Car {

    private Engine engine;

    public MotorCar(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void turnOffEngine() {
        engine.off();
    }

    @Override
    public void drive(int power) {
        if (engine.isOn()) {
            engine.drive(power);
        } else {
            throw new IllegalStateException("Please turn on the engine!");
        }
    }

    @Override
    public void reverse(int power) {
        if (engine.isOn()) {
            engine.reverse(power);
        } else {
            throw new IllegalStateException("Please turn on the engine!");
        }
    }
}
