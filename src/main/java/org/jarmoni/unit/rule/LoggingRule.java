package org.jarmoni.unit.rule;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingRule extends TestWatcher {

	private final Logger logger = LoggerFactory.getLogger(LoggingRule.class);

	@Override
	protected void starting(final Description description) {
		logger.info("*** Entering={}#{} ***", description.getClassName(), description.getMethodName());
	}

	@Override
	protected void succeeded(final Description description) {
		logger.info("*** Succeeded={}#{} ***", description.getClassName(), description.getMethodName());
	}

	@Override
	protected void failed(final Throwable e, final Description description) {
		logger.info("*** Failed={}#{}", description.getClassName(), description.getMethodName());
	}

}
