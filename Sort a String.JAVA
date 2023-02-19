"Given a string consisting of lowercase letters, arrange all its letters in ascending order. "
 
 
//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        // code here
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
} 
