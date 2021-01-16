package lab06.sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QuickSorter {
    public List<Integer> sort(List<Integer> toSort) {
        if (toSort.isEmpty() || toSort.size() == 1) return toSort;
        int pivot = toSort.get(0);
        List<Integer> copy = new ArrayList<>(toSort);
        List<Integer> left = findLeft(copy, pivot);
        List<Integer> right = findRight(copy, pivot);
        right.remove(0);
        List<Integer> leftSorted = sort(left);
        List<Integer> rightSorted = sort(right);
        leftSorted.addAll(rightSorted);
        return leftSorted;
    }

    private List<Integer> findLeft(List<Integer> toSort, int pivot) {
        List<Integer> toReturn = new LinkedList<>();
        for (int ele : toSort) {
            if (ele < pivot) {
                toReturn.add(ele);
            }
        }
        return toReturn;
    }

    private List<Integer> findRight(List<Integer> toSort, int pivot) {
        List<Integer> toReturn = new LinkedList<>();
        for (int ele : toSort) {
            if (ele >= pivot) {
                toReturn.add(ele);
            }
        }
        return toReturn;
    }
}
