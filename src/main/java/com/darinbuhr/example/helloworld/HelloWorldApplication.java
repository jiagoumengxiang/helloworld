package com.darinbuhr.example.helloworld;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Hello World application that takes user input for generating the response.
 */
public class HelloWorldApplication {

    public static void main(String[] args) {
        String input = Arrays.stream(args).collect(Collectors.joining(" "));

        HelloWorldHandler handler = new HelloWorldHandler();
        System.out.println(handler.response(input));
    }
}
