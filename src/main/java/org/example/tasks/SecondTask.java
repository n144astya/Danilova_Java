package org.example.tasks;

public class SecondTask {

    private final String name;

    public SecondTask(String name) {
        this.name = name;
    }

    public void checkName(String name) {
        if (name.equalsIgnoreCase(this.name)) {
            System.out.println("Привет, " + name);
        } else System.out.println("Нет такого имени");
    }
}
