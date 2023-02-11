"Given a string s, extract all the integers from s."
  
 class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here        
        ArrayList<String> lst=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                StringBuilder sb=new StringBuilder();
                while(i<s.length())
                {
                     if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                     {
                        sb.append(s.charAt(i));
                        i++;
                     }
                     else
                     {
                        break;
                     }
                }
                lst.add(sb.toString());
            }
        }
        return lst;
} 
}
