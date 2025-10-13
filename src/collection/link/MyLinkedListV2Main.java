package collection.link;



public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("==데이터 추가==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        //첫 번째 항목에 추가, 삭제
        System.out.println("첫번째 항목에 추가");
        list.add(0, "d");
        System.out.println("list = " + list);

        System.out.println("첫번째 항목에 삭제");
        list.remove(0);
        System.out.println("list = " + list);

    }
}
