package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUse1 = new MyUser("a", 30);
        MyUser myUse2 = new MyUser("b", 20);
        MyUser myUse3 = new MyUser("c", 10);

        MyUser[] myUsers = new MyUser[]{myUse1, myUse2, myUse3};

        System.out.println("기본 데이터");
        System.out.println("myUsers = " + Arrays.toString(myUsers));

        System.out.println("기본 정렬");
        Arrays.sort(myUsers);
        System.out.println("myUsers = " + Arrays.toString(myUsers));

        //추가
        System.out.println("Id 정렬");
        Arrays.sort(myUsers, new IdComparator());
        System.out.println("myUsers = " + Arrays.toString(myUsers));
    }


}
