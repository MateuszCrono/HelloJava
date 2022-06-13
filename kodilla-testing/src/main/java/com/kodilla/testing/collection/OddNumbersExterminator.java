package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate (List<Integer> numbers) {

        ArrayList<Integer> numList = new ArrayList<>();

        for (int evenNumber : numbers) {
            if (evenNumber % 2 == 0) {
                numList.add(evenNumber);
            }

        }
        return numList;
    }
}

