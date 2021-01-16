package lab07.src;

import java.util.LinkedList;
import java.util.List;

public class BrokenQuicksort {
    public static List<Integer> sort(List<Integer> toSort) {
        if (toSort.isEmpty() || toSort.size()==1) return toSort;
        int pivot = toSort.get(0);
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();

        for (int ele : toSort) {
            if (ele <= pivot) left.add(ele);
            else if (ele > pivot) right.add(ele);
        }

        List<Integer> leftSorted = sort(left);
        List<Integer> rightSorted = sort(right);

        leftSorted.addAll(rightSorted);
        return leftSorted;
    }

    public static void main(String[] args) {
        List<Integer> test = new LinkedList<Integer>();
        test.add(3);
        test.add(5);
        test.add(1);
        test.add(5);
        test.add(7);
        test.add(2);
        System.out.println(sort(test));
    }
}
