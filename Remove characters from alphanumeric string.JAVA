"Remove all characters except the numeric characters from an alphanumeric string."
  
  class Solution {
    String removeCharacters(String S) {
        // code here
       StringBuilder result = new StringBuilder();
       for(char c: S.toCharArray())
       {
           if(Character.isDigit(c))
           {
               result.append(c);
           }
           
       }
       return result.toString();
    }
}
