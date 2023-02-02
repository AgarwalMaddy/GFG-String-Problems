Given a list of names, Display the longest name.
  
  class GFG
  {
    String longest(String names [], int n)
    {
      int max = 0;
      String result = "";
      for(String name : names)  
      {
        if(name.length() > max)
        {
          max = name.length();
          result = name;
        }
      }
      return result;
    }
  }
