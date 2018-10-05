class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 2, 1, 4, 3 };
        printArray(bubbleSort(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }
}