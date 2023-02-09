"Given a string str, convert the first letter of each word in the string to uppercase. "
 
 //User function Template for Java

class Solution
{
    public String transform(String s)
    {
        // code here
        char [] ch = s.toCharArray();
        boolean space = true;
        
        for(int i = 0; i <ch.length; i++)
        {
            if(Character.isLetter(ch[i]))
            {
                if(space)
                {
                    ch[i] = Character.toUpperCase(ch[i]);
                    space = false;
                }
            }
            else
            space = true;
        }
        
        String result = String.valueOf(ch);
        return result;
    }
}
