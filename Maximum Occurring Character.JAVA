Given a string str. The task is to find the maximum occurring character in the string str. 
If more than one character occurs the maximum number of time then print the lexicographically smaller character.




class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] freq = new int[26];
        int maxFreq = 0;
        char maxChar = 'a';
        
        for(int i = 0 ;i < line.length(); i++)
        {
            char ch = line.charAt(i);
            freq[ch - 'a']++;
            if(freq[ch - 'a'] > maxFreq)
            {
                maxChar = ch;
                maxFreq = freq[ch - 'a'];
            }
            else if(freq[ch - 'a'] == maxFreq && ch < maxChar)
            {
                maxChar = ch;
            }
        }
        
        return maxChar;
    }
    
}
