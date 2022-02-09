package com.codegym;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(new CollectionUtilsAdapter());

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 4, 3,5,9,2));

        client.printMaxValue(set);
    }
}
