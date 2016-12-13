package com.darinbuhr.example.helloworld;

import java.util.Optional;

/**
 * Handler for generating Hello World response using user input.
 */
public class HelloWorldHandler {

    public String response(String input) {
        // Trim input and set default value if necessary
        String value = Optional.ofNullable(input)
                .map(s -> s.trim().isEmpty() ? null : s.trim())
                .orElse("World");

        return String.format("Hello %s!", value);
    }
}
