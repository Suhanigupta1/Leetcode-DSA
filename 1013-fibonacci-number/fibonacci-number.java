import java.util.*;
class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return getFib(dp, n);    
    }
    public int getFib(int[] dp, int n){
        if(n<=1){
            return n;
        }
        if(dp[n]==-1){
            dp[n] = getFib(dp, n-1)+getFib(dp, n-2);
        }
        return dp[n];
    }

}