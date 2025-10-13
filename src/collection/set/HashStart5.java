package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1,2,5,8,14,99}
        LinkedList<Integer>[] bukets = new LinkedList[CAPACITY];
        System.out.println("bukets = " + Arrays.toString(bukets));
        for (int i = 0; i < CAPACITY; i++) {
            bukets[i] = new LinkedList<>();
        }

        System.out.println("bukets = " + Arrays.toString(bukets));
        add(bukets, 1);
        add(bukets, 2);
        add(bukets, 5);
        add(bukets, 8);
        add(bukets, 14);
        add(bukets, 99);
        add(bukets, 9); // 인덱스 중복
        System.out.println("bukets = " + Arrays.toString(bukets));

        //검색
        int searchValue = 9;
        boolean contains = contains(bukets, searchValue);
        System.out.println("bukets.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] bukets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> buket = bukets[hashIndex];
        if (!buket.contains(value)) {
            buket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // 0(1)
        return bucket.contains(searchValue); // O(n)
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
