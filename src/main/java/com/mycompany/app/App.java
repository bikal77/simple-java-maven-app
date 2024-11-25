 package com.mycompany.app;

/**
 * Hello world!!
 * *
 * Author: Bikal KC
 * Student ID: C0929675
 * Date of Submission: Nov 27th, 2024
 */
public class App
{
//This is the new comment so that trigger in jenkins will get triggered.
    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
