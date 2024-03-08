package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 23, 54, 76, 54, 34);
        List<Integer> evenNumber = new ArrayList<>();
        List<Integer> oddNumber = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumber.add(number);
            }
            oddNumber.add(number);
        }

        for (int even : evenNumber) {
            System.out.println(even);
        }
    }
}
