Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and the 
uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.
  
  
class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String str = "";
        
        for(int i = 0 ; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(s2.indexOf(ch) == -1)
            {
                str += ch;
            }
        }
        
        for(int i = 0 ; i < s2.length();i++)
        {
            char ch = s2.charAt(i);
            if(s1.indexOf(ch) == -1)
            {
                str += ch;
            }
        }
        
        if(str.length() == 0)
        {
            return "-1";
        }
        
        return str;
    }
}
