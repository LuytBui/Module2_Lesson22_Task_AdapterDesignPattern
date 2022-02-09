package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{
    CollectionUtils collectionUtils;

    public CollectionUtilsAdapter() {
        this.collectionUtils = new CollectionUtils();
    }

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> listNumbers = new ArrayList<>(numbers);
        return this.collectionUtils.findMax(listNumbers);
    }
}
