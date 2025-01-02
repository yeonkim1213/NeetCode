// Time complexity: O(mlogn) for addNum(), O(m) for findMedian
// Space complexity: (n)
// Where m is the number of function calls and n is the length of the array.

package HeapPriorityQueue.FindMedianFromDataStream;

import java.util.PriorityQueue;
import java.util.Queue;

public class Heap {
    private Queue<Integer> maxHeap; // small elements - maxHeap
    private Queue<Integer> minHeap; // large elements - minHeap

    public Heap() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>((a, b) -> a - b);
    }

    public void addNum(int num) {
        maxHeap.add(num);
        if (maxHeap.size() - minHeap.size() > 1 ||
                !minHeap.isEmpty() &&
                        maxHeap.peek() > minHeap.peek()) {
            minHeap.add(maxHeap.poll());
        }
        if (minHeap.size() - maxHeap.size() > 1) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (double) (minHeap.peek() + maxHeap.peek()) / 2;
        } else if (maxHeap.size() > minHeap.size()) {
            return (double) maxHeap.peek();
        } else {
            return (double) minHeap.peek();
        }
    }
}
