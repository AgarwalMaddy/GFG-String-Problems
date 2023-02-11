"Given a string S of length N, find the pattern of the strings as shown below in the examples."
  
 //User function Template for Java

class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        
        ArrayList<String> list= new ArrayList<>();
        
        for(int i=0; i<S.length(); i++) {
            
            for(int j = 0; j < S.length()-i; j++) {
                System.out.print(S.charAt(j));
            }
      System.out.println();
        }
        return list;
    }
};
