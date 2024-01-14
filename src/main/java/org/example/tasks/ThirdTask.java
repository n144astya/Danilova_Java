package org.example.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdTask {

    public void filterArray(Integer[] array) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for(Integer integer: array) {
           if (integer % 3 == 0) {
               resultArray.add(integer);
           }
        }
        System.out.println(resultArray);
    }
}
