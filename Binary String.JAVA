Given a binary string S. The task is to count the number of substrings that start and end with 1. 
 For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
   
   
   
 class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String s)
    {
        // Your code here
         int count = 0;
         int ones = 0;
         for(int i = 0; i < s.length(); i++)
         {
             if(s.charAt(i) == '1')
             {
                 ones++;
             }
         }
         
         count =  ones * (ones -1) /2;
         return count;
    }
}
