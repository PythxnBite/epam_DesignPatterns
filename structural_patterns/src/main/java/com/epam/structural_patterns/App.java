package com.epam.structural_patterns;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AdapterPatternDemo aDemo = new AdapterPatternDemo();
        ProxyPatternClient pClient = new ProxyPatternClient();
        aDemo.demo();
        pClient.demo();
    }
}
