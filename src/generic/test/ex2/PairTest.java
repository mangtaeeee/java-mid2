package generic.test.ex2;

public class PairTest {
    
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecond("data");
        System.out.println("pair1.getFirst() = " + pair1.getFirst());
        System.out.println("pair1.getSecond() = " + pair1.getSecond());
        System.out.println("pair1 = " + pair1);

    }
}
