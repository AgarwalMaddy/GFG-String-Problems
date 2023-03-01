Given a function that takes a binary string. The task is to return the longest size of contiguous substring containing only ‘1’.
  
  
/*Complete the function below*/
class GfG{
    public int count(String s)
    {
        //add code here.
        int maxCount = 0 ;
        int count = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            if(s.charAt(i) == '1')
            {
                count++;
            }
            else
            {
                maxCount = Math.max(maxCount , count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
