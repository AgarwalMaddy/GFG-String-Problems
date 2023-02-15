"Given a string S as input. Delete the characters at odd indices of the string."
  
 // User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<S.length(); i++)
        {
            if(i % 2 == 0)
            str.append(S.charAt(i));
        }
        
        return str.toString();
    }
}
