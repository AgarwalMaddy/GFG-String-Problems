"Given a string of a constant length, print a triangle out of it."
"The triangle should start with the given string and keeps shrinking downwards by removing one character from the begining of the string."
"The spaces on the left side of the triangle should be replaced with dot character."
  
class Solution {
    static String triDownwards(String S){
        // code here
        String ans = S;
        StringBuffer s = new StringBuffer(S);
        for(int i = 0; i <S.length()-1;i++)
        {
            s.setCharAt(i,'.');
            ans += s;
        }
        return ans;
    }
};
