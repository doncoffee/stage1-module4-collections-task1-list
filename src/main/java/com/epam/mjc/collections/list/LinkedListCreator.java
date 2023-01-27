package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (Integer nums :
                sourceList) {
            if (nums % 2 == 0) {
                integers.offerLast(nums);
            } else {
                integers.offerFirst(nums);
            }
        }
        return integers;
    }
}
