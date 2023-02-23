Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.
  
  
  
//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        //code here.
        Set<Character> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        for(int i = s.length() - 1 ; i>= 0 ; i--)
        {
            char c = s.charAt(i);
            if(c != ' ' && !set.contains(c))
            {
                str.append(c);
                set.add(c);
            }
        }
        
        return str.toString();
    }
}
