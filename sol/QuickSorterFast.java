package sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QuickSorterFast {

    public List<Integer> sort(List<Integer> toSort) {
        if (toSort.isEmpty() || toSort.size() == 1) return toSort;
        int pivot = toSort.get(0);
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();
        for (int ele : toSort) {
            if (ele < pivot) {
                left.add(ele);
            } else {
                right.add(ele);
            }
        }
        right.remove(0);
        List<Integer> leftSorted = sort(left);
        List<Integer> rightSorted = sort(right);
        leftSorted.add(pivot);
        leftSorted.addAll(rightSorted);
        return leftSorted;
    }

}