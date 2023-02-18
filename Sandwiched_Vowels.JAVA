"For a given string S, comprising of only lowercase English alphabets,"
"eliminate the vowels from the string that occur between two consonants(sandwiched between two immediately adjacent consonants). "
"Print the updated string on a new line."
  
//User function Template for Java

class Complete{
    
   
    public static String Sandwiched_Vowel(String str) 
    { 
        // Complete function
        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i < str.length(); i++)
        {
            if(i == 0 || i == str.length()-1)
            {
                result.append(str.charAt(i));
                continue;
            }
            
            if(isVowel(str.charAt(i)) == true && isVowel(str.charAt(i-1)) == false && isVowel(str.charAt(i+1))  == false)
            {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
        
    } 
    
    public static boolean isVowel(char c)
    {
       if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
       {
           return true;
       }
       else 
       {
           return false;
       }
    }
}
