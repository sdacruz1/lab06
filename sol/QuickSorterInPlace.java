package sol;

import java.util.ArrayList;
import java.util.List;

//Picking a pivot remains the same
//Have a left pointer and a right pointer
//If the left pointer is greater than the pivot, we want to swap it with an element that is less than the pivot
//We find this element using the right pointer, which looks for the next element that is less than the pivot
//Once this has been found, swap the elements
//This partitions the list into a region that is less the pivot and a region that is greater

public class QuickSorterInPlace {
    public ArrayList<Integer> sortArray = new ArrayList<Integer>();

    public ArrayList<Integer> sort(List<Integer> toSort) {
        int pivot = toSort.get(0);
        int lessPointer = 0;
        int greaterPointer = sortArray.size() - 1;

    }

    public int partition(List<Integer> toSwap, int leftPointer, int rightPointer){


    }

    public void swap(List<Integer> toSwap, int leftPointer, int rightPointer){
        int left = toSwap.get(leftPointer);
        int right = toSwap.get(rightPointer);
        toSwap.set(leftPointer, right);
        toSwap.set(rightPointer, left);
    }
}


