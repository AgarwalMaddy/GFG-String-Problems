"Given a string S, we need to find reciprocal of it."
"The reciprocal of the letter is found by finding the difference between the position of the letter and the first letter ‘A’."
"Then decreasing the same number of steps from the last letter ‘Z’. The character that we reach after above steps is reciprocal."
  
  
//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        // code here
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i<S.length(); i++)
        {
            char c = S.charAt(i);
            if(Character.isUpperCase(c))
            {
                result.append((char)('Z' - (c - 'A')));
            }
            else if(Character.isLowerCase(c))
            {
                result.append((char)('z' - (c - 'a')));
            }
            else 
            {
                result.append(c);
            }
        }
        return result.toString();
    }
}
