Given an integer n, your task is to complete the function convertToRoman
which prints the corresponding roman number of n. Various symbols and
their values are given below
Note:- There are a few exceptions for some numbers like 4 in roman is
IV,9 in roman is IX, similarly, 40 is XL while 90 is XC. Similarly, 400 is CD
while 900 is CM
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
  
  
  
//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		//code here
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < values.length ; i++)
        {
            while(n >= values[i])
            {
                n -= values[i];
                sb.append(symbols[i]);
            }
        }
        
        return sb.toString();
	}
}
