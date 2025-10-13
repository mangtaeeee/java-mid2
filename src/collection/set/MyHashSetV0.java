package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elemetData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if(contains(value)) {
            return false;
        }


        elemetData[size] = value;

        size++;
        return true;

    }

    public boolean contains(int value) {
        for (int date : elemetData) {
            if (date == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elemetData=" + Arrays.toString(Arrays.copyOf(elemetData, size)) +
                ", size=" + size +
                '}';
    }
}
