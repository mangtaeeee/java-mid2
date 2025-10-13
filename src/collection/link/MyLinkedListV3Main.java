package collection.link;



public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> StringList = new MyLinkedListV3<>();
        StringList.add("a");
        StringList.add("b");
        StringList.add("c");
        System.out.println(" string = " +StringList.get(0));

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer i = integerList.get(0);
        System.out.println("i = " + i);


    }
}
