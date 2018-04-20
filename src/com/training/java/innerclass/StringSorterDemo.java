package com.training.java.innerclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StringSorter {
    private List<String> strings;

    public List<String> getStrings() {return strings;}

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<String> naturalSort() {
        Collections.sort(strings);
        return strings;
    }

//    public List<String> naturalSortWithStreams() {
//        return strings.stream().sorted()
//                .collect(Collectors.toList());
//    }

    public List<String> lengthSort() {
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        return strings;
    }
    public List<String> lengthSortWithLambda() {
        Collections.sort(strings, (s1, s2) -> {return s1.length() - s2.length();});
        return strings;
    }

//    public List<String> lengthReverseSortWithStreams() {
//        return strings.stream()
//                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())).collect(Collectors.toList());
//    }
}


public class StringSorterDemo {
    public static void main(String[] args) {
        StringSorter ss = new StringSorter();
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        ss.setStrings(strings);
        System.out.println(strings);
        System.out.println("After sorting:");
        System.out.println(ss.lengthSort());
        System.out.println(ss.lengthSortWithLambda());
//        System.out.println("After reverse sorting:");

//        System.out.println(ss.lengthReverseSortWithStreams());

    }
}

