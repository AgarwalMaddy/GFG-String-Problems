"Given a string, check if all its characters are the same or not."
  
  //User function Template for Java

class Sol
{
    Boolean check (String s)
    {
        // your code here       
        int len = s.length();
        for(int i = 0;i<len;i++)
        {
           if(s.charAt(i) != s.charAt(0))
           return false;
        }
        return true;
    }
}
