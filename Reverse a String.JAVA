"Given a String S , print the reverse of the string as output."
  
 class Solution {
    static String revStr(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        str.append(S);
        return str.reverse().toString();
    }
}
