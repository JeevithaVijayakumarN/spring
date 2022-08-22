package com.nseit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlg sortAlg;

    public BinarySearchImpl(SortAlg sortAlg) {
        this.sortAlg = sortAlg;
    }

    public int binarySearch(int[] numbers, int numbersToSearch){
        //BubbleSortAlg bubblesort = new BubbleSortAlg();
        //QuickSort quickSort= new  QuickSort();
        int[] sortedNumbers = sortAlg.sort(numbers);
        //int [] sortedNumbers = quickSort.sort(numbers);
        System.out.println(sortAlg);
        return 12;
    }
}
