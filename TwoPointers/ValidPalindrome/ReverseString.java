// Time: O(n) - n: length of input string
// Space: O(n)

package TwoPointers.ValidPalindrome;

public class ReverseString {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}