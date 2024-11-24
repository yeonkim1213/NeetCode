// Time: O(nlogn)
// Space: O(n)

// HashMap
// key-value pair data structure that uses
// hashing to store data. Each key maps to a specific
// bucket in the underlying array, ensuring O(1) average
// time complexity for insertion and retrieval.
// Pro: Fast insertion and retrieval: O(1) on average.
// Pro: Keys are unique, ensuring no duplication in frequency counting.
// Con: Memory overhead due to hash table storage.
// Con: Worst-case complexity for operations can degrade to O(n) if hash collisions occur.

// ArrayList
// resizeable array that provides O(1) access for elements by index.
// inserting or deleting elements in the middle takes O(n)
// Pro: Simple to use and traverse sequentially.
// Pro: Dynamic resizing reduces concerns about fixed size
// Con: Sorting requires O(n * log n), which can be costly for large data.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorting {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        // key: number, value: frequency
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // grabs key and value from the count
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            // frequency, number
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        // Order the elements by frequency in descending order 
        // Most frequent elemetns appear first
        arr.sort((a, b) -> b[0] - a[0]);

        // Stores the top k most frequent elements to return as output
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}