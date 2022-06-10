package ph.nard.principles.two;

public interface Engine {
    void on();
    boolean isOn();
    void off();
    boolean isOff();
    void drive(int power);
    void reverse(int power);
}
