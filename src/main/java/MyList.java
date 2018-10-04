import java.util.*;

public class MyList<T extends Object> {
    private int size = 0;
    private static int INITIAL_SIZE = 10;
    private Object[] internalArray = new Object[INITIAL_SIZE];

    public void add(T element) {
        if (size == internalArray.length) {
            expandCapacity();
        }
        internalArray[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= internalArray.length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + internalArray.length);
        }
        
        return (T) internalArray[index];
    }

    private void expandCapacity() {
        int newSize = internalArray.length * 2;
        internalArray = Arrays.copyOf(internalArray, newSize);
    }

}