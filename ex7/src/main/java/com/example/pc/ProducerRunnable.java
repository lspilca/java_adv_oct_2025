package com.example.pc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerRunnable implements Runnable {

    private List<RandomValueProducedListener> listeners = new ArrayList<>();

    @Override
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                synchronized (Container.container) {
                    if (Container.container.size() < 100) {
                        int randomNumber = rand.nextInt(10000);
                        Container.container.add(randomNumber);
                        notifyRandomValueProducedListener(new  NumberGeneratedEvent(randomNumber));
                        Container.container.notifyAll();
                    } else {
                        Container.container.wait();
                    }
                }
            }
        } catch (InterruptedException e) {}
    }

    private void notifyRandomValueProducedListener(NumberGeneratedEvent event) {
        listeners.forEach(l -> l.randomNumberGenerated(event));
    }

    public void addRandomValueProducedListener(RandomValueProducedListener listener) {
        listeners.add(listener);
    }

    public void removeRandomValueProducedListener(RandomValueProducedListener listener) {
        listeners.remove(listener);
    }

}
