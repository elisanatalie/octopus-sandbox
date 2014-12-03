package org.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jBasicExample {
	private static final Logger logger = LogManager.getLogger(Log4jBasicExample.class);

	public void printLogs(final String parameter) {
		// logs a debug message
		if (Log4jBasicExample.logger.isDebugEnabled()) {
			Log4jBasicExample.logger.debug("This is debug");
		}

		// logs an error message with parameter
		Log4jBasicExample.logger.error("This is error : " + parameter);

	}
}
