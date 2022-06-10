package ph.nard.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ph.nard.concurrency.Utils;

public class Greetings {

    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        new Thread(greetings::hello, "T1").start();
        new Thread(greetings::hi, "T2").start();
    }

    public void hello() {
        lock1.lock();
        System.out.println("lock1 acquired, waiting to acquire lock2.");
        Utils.sleep(50);

        lock2.lock();
        System.out.println("lock2 acquired");

        try {
            System.out.println("executing first operation.");
        } finally {

            lock2.unlock();
            lock1.unlock();
        }
    }

    public void hi() {
        lock2.lock();
        System.out.println("lock2 acquired, waiting to acquire lock1.");
        Utils.sleep(50);

        lock1.lock();
        System.out.println("lock1 acquired");

        try {
            System.out.println("executing second operation.");
        } finally {

            lock1.unlock();
            lock2.unlock();
        }
    }
}
