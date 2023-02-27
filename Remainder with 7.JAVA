Given a number as string(n) , find the remainder of the number when it is divided by 7
  
  
class Solution
{
    // Complete the function
    int remainderWith7(String num)
    {
        // Your code here
        java.math.BigInteger n = new java.math.BigInteger(num);
        java.math.BigInteger q = n.mod(new java.math.BigInteger("7"));
        int ans = q.intValue();
        return ans;
    }
}
