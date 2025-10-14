package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        //데이처 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println("deque = " + deque);

        //다음 꺼낼 데이터 확인
        System.out.println("deque.peek() = " + deque.peek());
    }

}
