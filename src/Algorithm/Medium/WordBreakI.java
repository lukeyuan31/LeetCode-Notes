package Algorithm.Medium;
import java.util.*;

public class WordBreakI {
    public boolean wordBreak(String s, List<String> ws) {
        Set<String> set = new HashSet<>();
        for (String str : ws) set.add(str);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (!dp[j]) continue;
                if (set.contains(s.substring(j, i + 1))) {
                    dp[i + 1] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
