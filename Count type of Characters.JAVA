"Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
Note: There are no white spaces in the string."
  
class Sol
{
    int[] count (String s)
    {
        int[] res = new int[4];
        // your code here     
        for(char c:s.toCharArray())
        {
            if(Character.isLowerCase(c))
            res[1]++;
            
            else if(Character.isUpperCase(c))
            res[0]++;
            
            else if(Character.isDigit(c))
            res[2]++;
            
            else
            res[3]++;
        }
        
        return res;
    }
}
