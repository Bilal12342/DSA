import java.util.Arrays;
public class MyArrayList<T> {
    private T[] asArray;
    private int size; 

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        asArray = (T[]) new Object[10];
        size = 0;
    }

    public void add(T value) {
        ensureCapacity();
        asArray[size++] = value;
    }

    public void insert(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        ensureCapacity();
        System.arraycopy(asArray, index, asArray, index + 1, size - index);
        asArray[index] = value;
        size++;
    }
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        System.arraycopy(asArray, index + 1, asArray, index, size - index - 1);
        asArray[--size] = null; 
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (asArray[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        asArray[index] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return asArray[index];
    }

    private void ensureCapacity() {
        if (size == asArray.length) {
            asArray = Arrays.copyOf(asArray, asArray.length * 2 + 1);
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(asArray, size));
    }
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List: " + list);
        
        list.insert(1, 15);
        System.out.println("After insert at index 1: " + list);
        
        list.delete(2);
        System.out.println("After delete at index 2: " + list);
        
        System.out.println("List contains 20? " + list.contains(20));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
        
        list.set(1, 25);
        System.out.println("After set at index 1: " + list);
        
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
