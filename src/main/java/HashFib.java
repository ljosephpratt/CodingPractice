import java.util.*;

class HashFib {
    public static void main(String[] args) {
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(10));

        int key = -32;
        int hash = key >>> 16;
        System.out.println(key ^ hash);
    }
    
    static int fib(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        if (!map.containsKey(n)) {
            map.put(n, fib(n - 1) + fib(n - 2));
        }
        return map.get(n);
    }
}