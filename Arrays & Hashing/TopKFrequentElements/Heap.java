// Time: O(nlogk) - n: length of the array, k: number of top frequent elements
// Space: O(n+k)
// PriorityQueue
// Implemented as a binary heap
// Allows efficient retrieval of the smallest(min-heap) or largest(max-heap) element
// offer() (insert): O(logk)
// poll() (remove): O(logk)
// peek() (view the smallest/largest element): O(1)
// Pro: Dynamic size managment
// Con: Always retrieves the highest/lowest priority element; intermediate not efficient
// Not thread safe - requires synchronization in multi-threaded environments.
// Heap 
// Pro: Efficient for priority operations (getting min or max - O(1) but insertion and deletion O(log n))
// Heaps are implemented as arrays - reduce memory overhead compared to other tree-based structrues
// Dynamically grow or shrink
// Simple parent-chile calculation - Parent (i-1)-2, left child 2i+1, right child 2i+2
// Con: Limited search efficiency - heap does not maintain a global order
// Unordere elements except for the root
// Not for general purpose data structure
// Complex mainteinance

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Heap {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // min-heap of size k to track the k most frequent elements
        // frequency, number
        // stores elements by ascending order
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            // frequency, number
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        }
        return res;
    }
}