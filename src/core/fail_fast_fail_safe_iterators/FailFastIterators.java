package core.fail_fast_fail_safe_iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Behavior:
 *
 * If the collection is modified after the iterator is created (by anything other than the
 * iterator’s own remove()), the next iterator operation (next(), remove(), sometimes hasNext())
 * throws ConcurrentModificationException.
 *
 * helps you catch unsafe concurrent modifications early.
 */
public class FailFastIterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer val = it.next();
            if (val == 2) {
                // Structural modification outside the iterator
                list.add(4); // Boom: ConcurrentModificationException on next iterator call
            }

/*
            if (it.next() == 2) {
                it.remove(); // safe: Only iterator is modifying the collection
            }
 */
        }
    }
}