package com.example.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Container {

    private int x;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public int getX() {   // 1000 / 1
        try {
            lock.readLock().lock();
            return x;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void incrementX() {  // this
        try {
            lock.writeLock().lock();
            x++;
        }  finally {
            lock.writeLock().unlock();
        }
    }

    public synchronized void a1() {

    }

    public void a2() {
        synchronized (this) { // same with a1

        }
    }

    static synchronized void m1() {
        // code
    }

    static void m2() {
        synchronized (Container.class) { // same with m1
            // code
        }
    }
}
