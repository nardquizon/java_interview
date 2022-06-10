package ph.nard.concurrency.sync;

import ph.nard.concurrency.Utils;

public class Main {
    public static final Object object1 = new Object();
    public static final Object object2 = new Object();

    public void method1() {
        synchronized (object1) {
            Utils.sleep(100);
            synchronized (object2) {
                System.out.println("Executing method1()");
            }
        }
    }

    public void method2() {
        synchronized (object2) {
            Utils.sleep(100);
            synchronized (object1) {
                System.out.println("Executing method2()");
            }
        }
    }

    public static void main(String... args) {
        Main main = new Main();
        new Thread(main::method1, "T1").start();
        System.out.println("Started T1");
        new Thread(main::method2, "T2").start();
        System.out.println("Started T2");
    }
}
