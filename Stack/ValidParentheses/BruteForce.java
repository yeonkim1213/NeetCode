// Time: O(n^2) - contains, replace calls. n - input string size
// Space: O(n) - replace creates a new string

package Stack.ValidParentheses;

public class BruteForce {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }
}