package com.mycompany.app;

/**
 * Hello world!
 * Hola Mundo!
 */
public class App
{

    private final String message = "Hello World!";

    private final String messageSpanish = "Hola mundo!";

    public App() {}

    public static void main(String[] args) {

        System.out.println(new App().getMessage());
        System.out.println(new App().getMessageSpanish());
    }

    private final String getMessage() {
        return message;
    }

    private final String getMessageSpanish() {
        return messageSpanish;
    }

}
