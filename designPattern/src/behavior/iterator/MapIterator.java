package behavior.iterator;

import java.util.*;

public class MapIterator {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        iterateMap(map);
    }

    private static <K, V> void iterateMap(Map<K, V> map) {
        Set<K> keySet = map.keySet();
        Iterator<K> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            K key = iterator.next();
            V value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}