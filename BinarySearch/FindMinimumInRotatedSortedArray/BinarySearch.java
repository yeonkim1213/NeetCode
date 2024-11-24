// Time: O(log n)
// Space: O(1)
// You don't need to divide the cases where nums.length is odd or even because binary search will handle the cases.
// Edge case: Empty Array, Single Element Array

package BinarySearch.FindMinimumInRotatedSortedArray;

public class BinarySearch {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];

        while (l <= r) {
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            // middle value
            int m = l + (r - l) / 2;

            res = Math.min(res, nums[m]);
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }
}
