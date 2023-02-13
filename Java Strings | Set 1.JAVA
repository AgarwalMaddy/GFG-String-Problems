"Given two strings S1 and S2 as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string."
  
 
// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder result = new StringBuilder();
        String concat = S1 + S2;
        result.append(concat);
        
        result = result.reverse();
        return result.toString();
    }
}
