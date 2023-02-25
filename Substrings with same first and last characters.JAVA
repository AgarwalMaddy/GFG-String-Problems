Given string s, the task is to find the count of all substrings which have the same character at the beginning and end.
  
 
//User function Template for Java

class Solution {
    int countSubstringWithEqualEnds(String s) {
        // code here
        int count = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            for(int j = i ; j < s.length(); j++)
            {
                if(s.charAt(j) == c)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
