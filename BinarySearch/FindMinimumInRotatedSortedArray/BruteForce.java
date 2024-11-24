// Time: O(n)
// Space: O(1)

package BinarySearch.FindMinimumInRotatedSortedArray;

import java.util.Arrays;

public class BruteForce {
     public int findMin(int[] nums) {
        // Arrays.stream: converts the input array nums into a sequential stream of integers
        // min(): finds the smallest value in the stream -> returns an OptionalInt(special container object that might contain an integer or might be empty if the stream is empty)
        // getAsInt(): Extracts the value from the OptionalInt
        return Arrays.stream(nums).min().getAsInt();
    }
}
