package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // TODO: Esta lista la vas a construir con el input del usuario desde la ventana
        String[] playerNames = {"Adan", "German", "Ivan", "Oscar", "Poonam"};

        Arrays.stream(playerNames)
                .map(Runner::new)
                .map(ThreadRunner::new)
                .map(Thread::new)
                .forEach(Thread::start);

    }
}