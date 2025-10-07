package com.example.pc;

public class ConsumerRunnable implements  Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Container.container) {
                    if (Container.container.size() > 0) {  // race condition
                        int consumedValue = Container.container.get(0);
                        Container.container.remove(0);
                        Container.container.notifyAll();
                        System.out.println("Removed value " + consumedValue);
                    } else {
                        Container.container.wait(1000);
                    }
                }
            }
        } catch (InterruptedException e) {}
    }
}
