import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 2, 1, 4, 3 };
        List<Integer> list = new ArrayList<>();
        for(int i : arr)
            list.add(i);
        // bubble3(arr);
        quick4(arr, 0, arr.length - 1);
        printArray(arr);
        List<Integer> result = mergeSort1(list);
        System.out.println(result);
    }

    public static void bubble1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void quick1(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        
        if (low >= high)
            return;
        
        int pivotIndex = low + (high - low) / 2;
        int pivot = arr[pivotIndex];
                
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quick1(arr, low, j);
        if (high > i)
            quick1(arr, i, high);
    }

    public static void bubble2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quick2(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quick2(arr, low, j);
        if (high > i)
            quick2(arr, i, high);
    }

    public static void bubble3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void quick3(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quick3(arr, low, j);
        if (high > i)
            quick3(arr, i, high);
    }

    public static List<Integer> mergeSort1(List<Integer> list) {
        if (list.size() <= 1)
            return list;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() / 2) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        left = mergeSort1(left);
        right = mergeSort1(right);

        return merge1(left, right);
    }

    private static List<Integer> merge1(List<Integer> left, List<Integer> right) {
        List<Integer> sorted = new ArrayList<>();        
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) <= right.get(0)) {
                sorted.add(left.get(0));
                left = left.subList(1, left.size());
            } else {
                sorted.add(right.get(0));
                right = right.subList(1, right.size());
            }
        }
        if (!left.isEmpty()) {
            for (int i : left) {
                sorted.add(i);
            }
        }
        if (!right.isEmpty()) {
            for (int i : right) {
                sorted.add(i);
            }
        }

        return sorted;
    }

    public static void quick4(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quick4(arr, low, j);
        if (high > i) 
            quick4(arr, i, high);
    }

    public static List<Integer> mergeSort2(List<Integer> list) {
        if (list.size() <= 1)
            return list;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() / 2) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }

        left = mergeSort2(left);
        right = mergeSort2(right);

        return merge2(left, right);
    }

    private static List<Integer> merge2(List<Integer> left, List<Integer> right) {
        List<Integer> sorted = new ArrayList<>();
        while(!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) <= right.get(0)) {
                sorted.add(left.get(0));
                left = left.subList(1, left.size());
            } else {
                sorted.add(right.get(0));
                right = right.subList(1, right.size());
            }
        }

        if (!left.isEmpty()) {
            for (int l : left) {
                sorted.add(l);
            }
        }

        if (!right.isEmpty()) {
            for (int r : right) {
                sorted.add(r);
            }
        }

        return sorted;
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }
}