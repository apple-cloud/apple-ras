package com.appleframework.ras.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggingTest {

    private static final Logger logger = LoggerFactory.getLogger(LoggingTest.class);

    public static void main(String[] args) {
        logger.debug("debug");
        logger.warn("warm");
        logger.error("error");
    }

}
