package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        //원하는곳에 데이터 추가
        System.out.println("addList");
        list.add(3, "addList"); //O(1)
        System.out.println("list = " + list);
        list.add(0, "addFirst"); //O(n)
        System.out.println("list = " + list);

        Object remove = list.remove(4); // O(1)
        System.out.println("remove = " + remove);
        System.out.println("list = " + list);

        Object remove1 = list.remove(0); //O(n)
        System.out.println("remove1 = " + remove1);
        System.out.println("list = " + list);

    }
}
