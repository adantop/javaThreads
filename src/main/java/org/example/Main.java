package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> playerNames = Arrays.asList("Adan", "German", "Ivan", "Oscar", "Poonam");

        playerNames.stream()
                .map(Runner::new)
                .map(ThreadRunner::new)
                .map(Thread::new)
                .forEach(Thread::start);

    }
}