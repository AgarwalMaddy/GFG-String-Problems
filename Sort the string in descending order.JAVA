Given a string str containing only lower case alphabets, the task is to sort it in lexicographically-descending order.
  
  
//User function Template for Java
class Solution 
{ 
    String ReverseSort(String str) 
    { 
        // code here
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder(new String(arr));
        result.reverse();
        return result.toString();
    }
} 
