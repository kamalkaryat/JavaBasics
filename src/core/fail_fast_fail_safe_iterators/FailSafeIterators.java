package core.fail_fast_fail_safe_iterators;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Fail‑Safe / Weakly Consistent Iterators
 * Seen In Concurrent collections and snapshot‑style collections
 *
 * CopyOnWriteArrayList, CopyOnWriteArraySet → snapshot iterators (never throw, don’t reflect
 * later changes).
 * ConcurrentHashMap, ConcurrentLinkedQueue, ConcurrentSkipListMap/Set → weakly consistent
 * iterators (don’t throw; may reflect some updates that happen during iteration).
 *
 * Behavior:
 *      Do not throw ConcurrentModificationException.
 *      Snapshot (copy-on-write): iterator sees a fixed snapshot taken at iteration start;
 *                              writes go to a new copy. Great for many reads, few writes.
 *      Weakly consistent: iterator can see some concurrent changes while iterating
 *                          (no strict guarantees), but it won’t throw.
 */
public class FailSafeIterators {

    public static void main(String[] args) {
        //snapshotIteratorsDemo();
        weaklyConsistentDemo();
    }

    private static void weaklyConsistentDemo() {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "A"); map.put(2, "B");
        for (Integer k : map.keySet()) {
            if (k == 1) {
                map.put(3, "C"); // Allowed, iterator won't throw
            }
            System.out.println(k);
        }
        // Output includes 1 and 2; 3 may or may not appear during the same iteration.
        System.out.println("Post Loop: "+map);
    }

    public static void snapshotIteratorsDemo() {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 2, 3});
        for (Integer val : list) {
            if (val == 2) {
                list.add(4); // Allowed, won't affect this iteration's snapshot
            }
            System.out.println(val);
        }
        // Prints: 1, 2, 3
        // After loop, list contains [1, 2, 3, 4]

        System.out.println("After Loop: " + list);
    }
}
