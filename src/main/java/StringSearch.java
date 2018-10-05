import java.util.*;

class StringSearch {
    public static void main(String[] args) {
        String s1 = "ABCA";
        String s2 = "BCABCA";
        String s3 = "ABC";

        System.out.println(findRepeats(s1));
        System.out.println(findRepeats(s2));
        System.out.println(findRepeats(s3));
    }

    static String findRepeats(String str) {
        char[] charArr = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char c : charArr) {
            if (set.contains(c))
                return Character.toString(c);
            else
                set.add(c);
        }
        return "";
    }
}