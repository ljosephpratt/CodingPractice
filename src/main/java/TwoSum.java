import java.util.*;
class TwoSum {
    public static void main(String[] arfs) {
        int target = 10;
        int[] nums = new int[]{2,3,6,7,8};
        System.out.println(twoSum(nums, target));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(target - numbers[i])) {
                result[0] = target - numbers[i];
                result[1] = numbers[i];
                return result;
            }
            set.add(numbers[i]);
        }
        return result;
    }
}