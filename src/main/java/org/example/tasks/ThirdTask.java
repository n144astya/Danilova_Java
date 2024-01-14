package org.example.tasks;

import java.util.ArrayList;

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
