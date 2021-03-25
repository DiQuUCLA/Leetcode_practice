import java.util.*;

class DivisorGame{
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n+1];
        
        dp[0] = false;
        for(int i = 1; i <= n; i++) {
            dp[i] = false;
            for(int j = 0; j < i; j++) {
                int x = i-j;
                if(x > 0 && x < i && i % x == 0 && dp[j] == false) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public boolean ezmath(int n) {
        return n % 2 == 0;
    }
}
