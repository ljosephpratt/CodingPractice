import java.util.*;

class StringCoding {
    public static void main(String[] args) {
        String s1 = "ABCA";
        String s2 = "BCABA";
        String s3 = "ABC";
        // System.out.println(findRepeatingStringArr(s1));
        // System.out.println(findRepeatingStringArr(s2));
        // System.out.println(findRepeatingStringArr(s3));
        System.out.println(findRepeatingString(s1));
        System.out.println(findRepeatingString(s2));
        System.out.println(findRepeatingString(s3));
        
    }
    static String findRepeatingStringArr(String str) {
        char[] charArr = str.toCharArray();
        int count = 0;
        while(count < charArr.length) {
            for (int i = count + 1; i < charArr.length; i++) {
                if (charArr[count] == charArr[i])
                    return new String(new char[]{charArr[count]});
            }
            count++;
        }
        return "";
    }

    static String findRepeatingString(String str) {
        char[] charArr = str.toCharArray();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (char c : charArr) {
            String result = Character.toString(c);
            if (map.containsKey(result))
                return result;
            else
                map.put(result, 1);
        }
        return "";
    }
}