// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}
// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        long  sum=0;
        String temp="0";
        boolean ca=false;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
        
            if(Character.isDigit(c) && !ca)
            {
               temp+=c;
               //System.out.println(temp);
               ca=true;
            }
            else if(Character.isDigit(c) && ca)
            {
               temp+=c;
                // System.out.println(temp);
            }
            else if(!Character.isDigit(c))
            {
                long l=Long.parseLong(temp);
                //  System.out.print(temp);
                sum+=l;
                temp="0";
                ca=false;
                 // System.out.println(" " + temp);
            }
        }
        long l=Long.parseLong(temp);
        sum+=l;
        return sum;
    }
    
}
