"Given a string S which consists of alphabets , numbers and special characters"
"You need to write a program to split the strings in three different strings S1, S2 and S3"
"such that the string S1 will contain all the alphabets present in S , the string S2 will contain"
"all the numbers present in S and S3 will contain all special characters present in S."
"The strings S1, S2 and S3 should have characters in same order as they appear in input."
  
  class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        List<String> lst = new ArrayList<>();
        String s1="";
        String s2="";
        String s3="";
        for(int i=0;i<S.length();i++)
        {
            if((S.charAt(i)>='a' && S.charAt(i)<='z') || (S.charAt(i)>='A' && S.charAt(i)<='Z'))
            {
                s1 += S.charAt(i);
            }
            else if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                s2 += S.charAt(i);
            }
            else
            {
                s3 += S.charAt(i);
            }
        }
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        return lst;
        
        
    }
}
