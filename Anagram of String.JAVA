Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. 
Find the minimum number of characters to be deleted to make both the strings anagram. 
Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.



/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
    {
        //add code here.
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            map1.put(c,map1.getOrDefault(c,0) + 1);
        }
        
         for(int i = 0 ; i < s1.length() ; i++)
        {
            char c = s1.charAt(i);
            map2.put(c,map2.getOrDefault(c,0) + 1);
        }
        
        int delete = 0 ;
        for(char c : map1.keySet())
        {
            int diff = map1.get(c) - map2.getOrDefault(c , 0);
            delete += Math.abs(diff);
        }
        for(char c : map2.keySet())
        {
            if(!map1.containsKey(c))
            {
                delete += map2.get(c);
            }
        }
        
        return delete;
        
    }
}
