package org.waitnotify;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private final Data load;

    public Receiver(final Data load) {
        this.load = load;
    }

    // standard constructors

    public void run() {
        for (String receivedMessage = load.receive();
             !"End".equals(receivedMessage);
             receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}