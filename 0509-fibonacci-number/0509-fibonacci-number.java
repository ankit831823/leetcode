class Solution {
    public int helper(int n,int []dp)
    {
        if(n<=1)
             return n;
        else if(dp[n]!=-1)
            return dp[n];
        else
             return dp[n]=helper(n-1,dp)+helper(n-2,dp);
       
    }
    public int fib(int n) {
        int []dp=new int[n+1];
        for(int i=0;i<n+1;i++)
              dp[i]=-1;
        return helper(n,dp);
        
    }
}