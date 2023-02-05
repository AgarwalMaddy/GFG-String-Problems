"Given a string, remove the vowels from the string."
  
class Solution {
    String removeVowels(String S) {
        // code here
        StringBuilder result = new StringBuilder();
        for(char c: S.toCharArray())
        {
            if(!isVowel(c))
            result.append(c);
        }
        return result.toString();
    }
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u');
    }
}
