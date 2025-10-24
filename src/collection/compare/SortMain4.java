package collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUse1 = new MyUser("a", 30);
        MyUser myUse2 = new MyUser("b", 20);
        MyUser myUse3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUse1);
        list.add(myUse2);
        list.add(myUse3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);
//        Collections.sort(list);
        System.out.println(list);


        System.out.println("Id 정렬");
        list.sort(new IdComparator());
        System.out.println(list);
    }


}
