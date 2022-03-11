package com.security4beginner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.fatal("We've just greeted ${java:os}");
        System.out.println("Hello World!");

    }
}
