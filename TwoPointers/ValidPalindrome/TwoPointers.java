// Time: O(n) - n: length of input string
// Space: O(1)

package TwoPointers.ValidPalindrome;

public class TwoPointers {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            // moves pointer if right is greater or it's not alphabet/number
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    // checks if it's alphabet or number
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}