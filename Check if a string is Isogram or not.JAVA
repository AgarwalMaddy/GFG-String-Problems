"Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once."
  
  
  
 class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        HashMap<Character, Integer>map = new HashMap();
        for(int i = 0; i < data.length(); i++)
        {
            char c = data.charAt(i);
            if(map.containsKey(c))
            {return false;}
            else
            {map.put(c,1);}
        }
        return true;
    }
}
