"Given a string S. Count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence."




//User function Template for Java

class Sol
{
    int getCount (String S, int N)
    {
        int[] freq = new int[26];
        char[] chArray = S.toCharArray();
        //Track the first char
        freq[S.charAt(0)-'a']++;
        for(int i=1; i<chArray.length; i++)
        {
            if(chArray[i-1]!=chArray[i])
            {
                int idxFromChar = chArray[i]-'a';
                freq[idxFromChar]++;
            }
        }
        int count=0;
        for(int I : freq)
        {
            if(I==N) count++;
        }
        return count;
    }
}
