package com.nseit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
