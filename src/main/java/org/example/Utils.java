package org.example;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Integer> multiplyByTwo(List<Integer> source) {
//    Transformer<Integer> timesTwo = new Transformer<Integer>() {
//        @Override
//        public Integer transformOriginal(Integer original) {
//            return original * 2;
//        }
//    };

        Transformer<Integer> timesTwo = (Integer original) -> original * 2;
        return transformList(source, timesTwo);
    }

    public static List<Integer> addTen(List<Integer> source) {
        class PlusTenTransformer implements Transformer<Integer> {
            @Override
            public Integer transformOriginal(Integer original) {
                return original + 10;
            }
        };

        PlusTenTransformer plusTen = new PlusTenTransformer();
        return transformList(source, plusTen);
    }

    public static List<String> firstLetters(List<String> source) {
        Transformer<String> getFirstLetter = new Transformer<String>() {
            @Override
            public String transformOriginal(String original) {
                return String.valueOf(original.charAt(0));
            }
        };

        return transformList(source, getFirstLetter);
    }


    public static List<Integer> onlyNegative(List<Integer> source) {
//        Checker<Integer> checker = new Checker<Integer>() {
//            @Override
//            public boolean check(Integer value) {
//                return value<0;
//            }
//        };

        return filterList(source, x -> x < 0);
    }

    public static <T> List<T> transformList(List<T> source, Transformer<T> transformer) {
        List<T> result = new ArrayList<>();
        for (T currentElement : source) {
            T elementAfterTransformation = transformer.transformOriginal(currentElement);
            result.add(elementAfterTransformation);
        }

        return result;
    }

    public static <T> List<T> filterList(List<T> source, Checker<T> checker) {
        List<T> result = new ArrayList<>();
        for (T currentElement : source) {
            if (checker.check(currentElement)) {
                result.add(currentElement);
            }
        }

        return result;
    }
}
