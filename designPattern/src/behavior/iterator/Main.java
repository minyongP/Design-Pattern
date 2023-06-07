package behavior.iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        iterateCollection(list);

        // HashSet
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        iterateCollection(set);

        // LinkedList
        Deque<Character> deque = new LinkedList<>();
        deque.add('A');
        deque.add('B');
        deque.add('C');
        iterateCollection(deque);
    }

    private static <E> void iterateCollection(Collection<E> collection) {
        Iterator<E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            System.out.println(element);
        }
        System.out.println();
    }
}
