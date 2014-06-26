package org.jarmoni.unit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingRuleTest {

	// CHECKSTYLE:OFF
	@Rule
	public LoggingRule loggingRule = new LoggingRule();

	@Rule
	public ExpectedException ee = ExpectedException.none();
	// CHECKSTYLE:ON

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingRuleTest.class);

	@Test
	public void testSucceeded() throws Exception {
		LOGGER.info("Will succeed...");
	}

	@Test
	public void testFailed() throws Exception {
		LOGGER.info("Simulating a fail...");
		this.loggingRule.failed(new RuntimeException(), Description.createSuiteDescription(this.getClass()));
	}

}
