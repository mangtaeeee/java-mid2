package collection.compare;

import java.util.LinkedList;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUse1 = new MyUser("a", 30);
        MyUser myUse2 = new MyUser("b", 20);
        MyUser myUse3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUse1);
        treeSet1.add(myUse2);
        treeSet1.add(myUse3);
        System.out.println("treeSet1 = " + treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUse1);
        treeSet2.add(myUse2);
        treeSet2.add(myUse3);
        System.out.println("ID정렬");
        System.out.println("treeSet2 = " + treeSet2);


    }

}
