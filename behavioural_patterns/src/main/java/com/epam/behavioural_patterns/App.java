package com.epam.behavioural_patterns;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws NumberFormatException, IOException {
        ObserverPatternDemo oDemo = new ObserverPatternDemo();
        oDemo.demo();
        StrategyPatternDemo.demo();
    }
}
