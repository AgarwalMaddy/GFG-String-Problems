There is a hacker named "Vijay" who has developed a method to check whether an id at some social networking site is fake or real using its username.
His method includes: if the number of distinct consonent characters in one's user name is odd, then the user is a male, otherwise a female.
You are given the string that denotes the user name, please help Vijay to determine the gender of this user by his method.
Ignore the vowels.
Note: The input only contains lowercase English alphabets.
  

  
//User function Template for Java

class Solution
{
    public String solve(String a)
    {
        //code here
        int distinct = 0;
        boolean [] seen = new boolean[26];
        String vowels = "aeiou";
        for(char c: a.toCharArray())
        {
            if(!vowels.contains(Character.toString(c)))
            {
                int index = c - 'a';
                if(!seen[index])
                {
                    seen[index] = true;
                    distinct++;
                }
            }
        }
        return (distinct % 2 == 0)? "SHE!" : "HE!";
    }
}
