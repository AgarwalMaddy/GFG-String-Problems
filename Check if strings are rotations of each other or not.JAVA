Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.


  class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length() != s2.length())
        {
            return false;
        }
        String s = s1 + s1;
        return s.contains(s2);
    }
    
}
