package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator.thenComparing(e -> Integer.parseInt(e)));
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double firstResult = 5 * Math.pow(Integer.parseInt(a), 2) + 3;
        double secondResult = 5 * Math.pow(Integer.parseInt(b), 2) + 3;
        return Double.compare(firstResult, secondResult);
    }
}
