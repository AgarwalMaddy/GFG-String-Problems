Given a string S. The task is to find the first repeated character in it. 
We need to find the character that occurs more than once and whose index of second occurrence is smallest. S contains only lowercase letters.
  
  
 
//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i< s.length();i++)
        {
            char c = s.charAt(i);
            if(set.contains(c))
            {
                result.append(c);
                return result.toString();
                
            }
            set.add(c);
        }
        return "-1" ;
    }
} 

 
