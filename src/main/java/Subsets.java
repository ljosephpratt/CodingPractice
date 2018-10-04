class Subsets {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        printSubsets(arr);
    }

    static void printSubsets(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & ( 1 << j)) > 0)
                    System.out.print(arr[j] + " ");
            }
            System.out.println("}");
        }
    }
}