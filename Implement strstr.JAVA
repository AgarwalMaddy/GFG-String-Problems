Your task is to implement the function strstr. 
The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. 
The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
  
 
class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       if(x.isEmpty())
       {
           return 0;
       }
       for(int i = 0 ; i<= s.length() - x.length(); i++)
       {
           if(s.substring(i, i + x.length()).equals(x))
           {
               return i;
           }
       }
       
      return -1;
       
    }
}
