package ph.nard.principles.two;

public class ElectricCar implements Car {

    ElectricMotor electricMotor;

    public ElectricCar(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void drive(int power) {
        if (electricMotor.isOn()) {
            electricMotor.drive(power);
        } else {
            throw new IllegalStateException("Please turn on the electric motor!");
        }
    }

    @Override
    public void reverse(int power) {
        if (electricMotor.isOn()) {
            electricMotor.reverse(power);
        } else {
            throw new IllegalStateException("Please turn on the electric motor!");
        }
    }
}
