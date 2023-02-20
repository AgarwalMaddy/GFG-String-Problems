"Given a string S, Check if characters of the given string can be rearranged to form a palindrome."
"Note: You have to return 1 if it is possible to convert the given string into palindrome else return 0."
  
  
 class Sol
{
    int isPossible (String S)
    {
        // your code here
        int[] freq = new int[26];
        for(char c : S.toCharArray())
        {
            freq[c-'a']++;
        }
        
        int odd = 0 ;
        for(int i = 0; i <26; i++)
        {
            if(freq[i] % 2 == 1)
            odd++;
        }
        if(odd > 1)
        {
            return 0;
        }
        
        return 1;
    }
}
