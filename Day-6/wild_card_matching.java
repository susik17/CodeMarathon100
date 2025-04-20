import java.util.*; 

class Solution {
    //2.memoization 
    static boolean fn(int i,int j,String s,String p,Boolean[][] dp){
         //Base Cases 
         //1.process complete entire s&p
         if(i==0){
             if(j==0){
                 return true;
             }
             if(p.charAt(j) == '*'){
                 return fn(i,j-1,s,p,dp);
             }
             return false;
         }
         //2.pattern completed still string exists
         if(j==0){
             return false;
         }
         
         //Main Cases 
         if(dp[i][j]!=null){ 
             return dp[i][j];
             
         }
         //Case 1:matching or pattern contains '?'
         if(s.charAt(i)== p.charAt(j)||p.charAt(j) == '?'){
             return dp[i][j] = fn(i-1,j-1,s,p,dp);
         }
         //Case 2:pattern contains '*'
         if(p.charAt(j) == '*'){
             boolean a = fn(i,j-1,s,p,dp);
             boolean b =fn(i-1,j,s,p,dp);
             return dp[i][j] = a||b;
         }
         //case 3:not matching 
         return dp[i][j] = false;
     }
    /*
    //1.Using Recursion
     static boolean fn(int i,int j,String s,String p){
         //Base Cases 
         //1.process complete entire s&p
         if(i<0){
             if(j<0){
                 return true;
             }
             if(p.charAt(j) == '*'){
                 return fn(i,j-1,s,p);
             }
             return false;
         }
         //2.pattern completed still string exists
         if(j<0){
             return false;
         }
         
         //Main Cases 
         //Case 1:matching or pattern contains '?'
         if(s.charAt(i)== p.charAt(j)||p.charAt(j) == '?'){
             return fn(i-1,j-1,s,p);
         }
         //Case 2:pattern contains '*'
         if(p.charAt(j) == '*'){
             boolean a = fn(i,j-1,s,p);
             boolean b =fn(i-1,j,s,p);
             return a||b;
         }
         //case 3:not matching 
         return false;
     }
    */
     public static boolean wildCardMatching(String s, String p) {
        // Write your code here... 
        int m = s.length();
        int n = p.length();
        Boolean[][] dp = new Boolean[m][n];
        return fn(m-1,n-1,s,p,dp);
        
    }
}
