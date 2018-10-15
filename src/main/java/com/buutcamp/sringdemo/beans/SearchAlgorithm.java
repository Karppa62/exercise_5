package com.buutcamp.sringdemo.beans;

public class SearchAlgorithm {

    public Boolean find(int numberToFind, int[] numbers) {

        for (int number : numbers) {
            if (number == numberToFind)
                return true;
        }
        return false;
    }
}
