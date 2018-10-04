import java.util.*;

public class Sort {
    public List<Integer> mergeSort(List<Integer> unsorted) {
        if (unsorted.size() <= 1)
            return unsorted;
        
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        for (int i = 0; i < unsorted.size(); i++) {
            if (i < unsorted.size() / 2) {
                left.add(unsorted.get(i));
            } else {
                right.add(unsorted.get(i));
            }
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> sorted = new ArrayList<Integer>();
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) <= right.get(0)) {
                sorted.add(left.get(0));
                left = left.subList(1, left.size());
            } else {
                sorted.add(right.get(0));
                right = right.subList(1, right.size());
            }
        }

        for (int i = 0; i < left.size(); i++) {
            sorted.add(left.get(i));
        }

        for (int i = 0; i < right.size(); i++) {
            sorted.add(right.get(i));
        }

        return sorted;
    }

}