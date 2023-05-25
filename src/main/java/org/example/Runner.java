package org.example;

import java.util.Random;

public class Runner {
    private final String name;
    private final Integer speed;

    // TODO: Modificar el constructor para agregar la referencia al widget
    Runner(String name) {
        Random r = new Random();

        this.name = name;
        this.speed = r.nextInt(30);
    }

    public String getName() {
        return name;
    }

    public Integer getSpeed() {
        return speed;
    }

    // TODO: podrias quitar esto y implementarlo en ThreadRunner::run
    public void showResult() {
        System.out.println("Player " + this.name + " finished in " + this.speed + " s");
    }
}
