package org.misc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Question:
 * 1. Can multiple threads modify thread local value? Yes
 *
 * @author octopusgarden
 */
public class ThreadLocalExample {
	private static final Logger logger = LogManager.getLogger(ThreadLocalExample.class);

	public static class MyRunnable implements Runnable {
		ThreadLocal<SomeObject> threadLocal = new ThreadLocal<SomeObject>() {
			@Override
			public SomeObject initialValue() {
				return new SomeObject();
			}
		};

		public void run() {
			final int number = (int) Math.random() * 1000;
			this.threadLocal.get().setId(number);
			ThreadLocalExample.logger.debug("Generated number =" + number);

			try {
				Thread.sleep(2000);
			}
			catch (final InterruptedException e) {
				e.printStackTrace();
			}

			ThreadLocalExample.logger.debug("Number from thread local =" + this.threadLocal.get().getId());
		}

	}

	public static void main(final String[] args) {
		final MyRunnable myRunnable = new MyRunnable();
		final Thread thread1 = new Thread(myRunnable);
		final Thread thread2 = new Thread(myRunnable);

		thread1.start();
		thread2.start();
	}

}
