"Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string."
 
 class Solution
{
    String modify (String s)
    {
        // your code here
        int left = 0;
        int right = s.length() - 1;
        char [] result = s.toCharArray();
        while(left < right)
        {
            if(!isVowel(result[left]))
            left++;
            else if(!isVowel(result[right]))
            right--;
            else
            {
                char tem = result[left];
                result[left++] = result[right];
                result[right--] = tem;
            }
        }
        return new String(result);
    }
    public static Boolean isVowel(char c)
        {
            return c == 'a' ||  c == 'e' || c == 'i' || c == 'o' ||  c == 'u';
        }
}
