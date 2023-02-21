"Given two strings A and B. Find the characters that are not common in the two strings."
" Note :- Return the string in sorted order."
  
  
 //User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        String s="";
        int arr[]=new int[26];
        int arr1[]=new int[26];
        for(int i=0;i<A.length();i++){
            arr[A.charAt(i)-'a']=1;
        }
        for(int i=0;i<B.length();i++){
            arr1[B.charAt(i)-'a']=1;
        }
        for(int i=0;i<=25;i++){
            if((arr[i]^arr1[i])==1){
                s+=(char)('a'+i);
            }
        }
        return (s.length()==0)?"-1":s;
    }
}
