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
