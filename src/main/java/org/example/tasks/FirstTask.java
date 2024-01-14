package org.example.tasks;

public class FirstTask {

    private final int borderingValue;

    public FirstTask(int borderingValue) {
        this.borderingValue = borderingValue;
    }

    public void checkNumber(int number) {
        if (number > borderingValue) {
            System.out.println("Привет");
        }
    }
}
