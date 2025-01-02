// Time complexity: O(m) for addNum(), O(m∗nlogn) for findMedian()
// Space complexity: O(n)
// Where m is the number of function calls and n is the length of the array.

package HeapPriorityQueue.FindMedianFromDataStream;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    private ArrayList<Integer> data;

    public Sorting() {
        data = new ArrayList<>();
    }

    public void addNum(int num) {
        data.add(num);
    }

    public double findMedian() {
        Collections.sort(data);
        int n = data.size();
        // Odd sized list
        if ((n & 1) == 1) {
            return data.get(n / 2);
        }
        // Even sized list
        else {
            return (data.get(n / 2) + data.get(n / 2 - 1)) / 2.0;
        }
    }
}
