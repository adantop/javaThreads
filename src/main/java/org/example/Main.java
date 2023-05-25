package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO: Esta lista la vas a construir con el input del usuario desde la ventana
        List<String> playerNames = Arrays.asList("Adan", "German", "Ivan", "Oscar", "Poonam");

        playerNames.stream()
                .map(Runner::new)
                .map(ThreadRunner::new)
                .map(Thread::new)
                .forEach(Thread::start);

    }
}