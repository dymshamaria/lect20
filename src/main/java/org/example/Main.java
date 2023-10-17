package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(11, 33, 45, -9, 0, 135);
        System.out.println("Original");
        System.out.println(numbers);
        System.out.println("========");
        System.out.println(Utils.multiplyByTwo(numbers));
        System.out.println(Utils.addTen(numbers));
        System.out.println(Utils.onlyNegative(numbers));


        System.out.println(Utils.filterList(numbers, x -> {
            int remainder = x % 2;
            return remainder != 0;
        }));
        System.out.println(Utils.filterList(numbers, x -> (x % 2) != 0));


        System.out.println("=============");

        List<String> strings = List.of("каждый", "охотник", "желает", "знать", "где", "сидит", "фазан");
        System.out.println("Originals");
        System.out.println("-------");
        System.out.println(Utils.firstLetters(strings));
        System.out.println(Utils.filterList(strings, x -> x.length() == 5));
    }
}