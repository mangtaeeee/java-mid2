package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);

        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);

        //java.lang.UnsupportedOperationException 예외발생
        //unmodifiableList.add(5);

    }
}
