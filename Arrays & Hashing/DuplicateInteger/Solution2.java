// Data structure: Array
// Time complexity: O(n log n)
// Space complexity: O(1) (assuming in-place sorting, otherwise O(n) for some sorting algorithms)

import java.util.Arrays;

public class Solution2 {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
