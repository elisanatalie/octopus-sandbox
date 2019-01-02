package org.waitnotify;

public class Service {
    public static void main(final String[] args) {
        final Data data = new Data();
        final Thread sender = new Thread(new Sender(data));
        final Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }
}
