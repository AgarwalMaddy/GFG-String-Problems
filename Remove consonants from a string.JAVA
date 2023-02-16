"Given a string S, remove all consonants and print the modified string that contains vowels only."
 
 //User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
        //code here.
        String vowels = "aeiouAEIOU";
        String a = "No Vowel";
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1)
            {
                res.append(ch);
            }
        }
        if (res.length() == 0)
        {
        return "No Vowel";
        }
        else
        {
            return res.toString();
        }
        
    }
    
}
