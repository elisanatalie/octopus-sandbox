package org.log4j;

import org.junit.Test;

public class Log4jBasicExampleTest {

	@Test
	public void test() {
		final Log4jBasicExample log4jex = new Log4jBasicExample();
		log4jex.printLogs("Print this in the log");
	}

}
