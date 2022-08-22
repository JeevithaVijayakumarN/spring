package com.nseit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired

    private SortAlg quickSort;

    public int binarySearch(int[] numbers, int numbersToSearch){
        //BubbleSortAlg bubblesort = new BubbleSortAlg();
        //QuickSort quickSort= new  QuickSort();
        int[] sortedNumbers = quickSort.sort(numbers);
        //int [] sortedNumbers = quickSort.sort(numbers);
        System.out.println(quickSort);
        return 12;
    }
}
