"Given a string S, consisting only of english alphabets, replace all the alphabets with the alphabets occuring at the same position when counted"
"in reverse order of alphabets. For example, 'a' would be replaced by 'z', 'b' by 'y', 'c' by 'x' and so on."
"Any capital letters would be replaced by capital letters only."
  
 
 //User function Template for Java
class Solution 
{ 
    String convert(String s) 
    { 
        StringBuilder finals = new StringBuilder();
        
        for(char c: s.toCharArray())
        {
            if(Character.isUpperCase(c))
            finals.append((char)('Z' - c +'A'));
            
            else if(Character.isLowerCase(c))
            finals.append((char)('z' - c + 'a'));
            
            else
            finals.append(c);
        }
        
        return finals.toString();
    }
} 
