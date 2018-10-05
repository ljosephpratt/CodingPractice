class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 2, 1, 4, 3 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high) {
            return;
        }

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
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }
}