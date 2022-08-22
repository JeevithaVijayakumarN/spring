package com.nseit.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")


public class QuickSort implements SortAlg {
    @Override
    public int[] sort(int[] numbers) {
        // implementation of bubble sort
        return numbers;}
}
