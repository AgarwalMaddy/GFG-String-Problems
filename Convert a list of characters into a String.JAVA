"Given a list of characters, merge all of them into a string."
  
  
//User function Template for Java

class Solution{
    public String chartostr(char arr[], int N){
        StringBuilder s = new StringBuilder();
        for(char c: arr)
        {
            s.append(c);
        }
        return s.toString();
    }
}
