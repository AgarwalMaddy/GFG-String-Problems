"Given a non-empty sequence of characters str, return true if sequence is Binary, else return false."

Solution: 
class GFG
{
  boolean isBinary(String str)
  {
    for(char c : str.toCharArray())
    {
      if(c != '0' && c != '1')
      {
        return false;
      }
    }
    return true;
  }
}
