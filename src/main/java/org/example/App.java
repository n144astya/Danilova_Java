package org.example;

import org.example.helpers.InputReaderHelper;
import org.example.tasks.FirstTask;
import org.example.tasks.SecondTask;
import org.example.tasks.ThirdTask;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        InputReaderHelper reader = new InputReaderHelper();

        while (true) {
            System.out.print("\n\rEnter task number (0 for exit): ");
            int value = reader.readInt();
            switch (value) {
                case 0:
                    return;
                case 1:
                    System.out.print("First task.\n\rEnter number: ");
                    FirstTask firstTask = new FirstTask(7);
                    firstTask.checkNumber(reader.readInt());
                    break;
                case 2:
                    System.out.print("\n\rSecond task.\n\rEnter name: ");
                    SecondTask secondTask = new SecondTask("Вячеслав");
                    secondTask.checkName(reader.readName());
                    break;
                case 3:
                    System.out.println("\n\rEnter coma separated array: ");
                    new ThirdTask().filterArray(reader.readArray());
                    break;
                default:
                    System.out.println("Task not exist");
            }
        }
    }
}
