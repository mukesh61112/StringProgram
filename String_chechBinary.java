package com.company;

import java.util.Scanner;

public class String_chechBinary {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            String s=sc.next();
            CheckBinary obj=new CheckBinary();
            int ans=obj.chechBinary(s);
            System.out.print(ans);
            --t;
        }
    }
}
class CheckBinary{
      int chechBinary(String s)
      {
          for(int i=0;i<s.length();i++)
          {
              System.out.print(" "+ s.charAt(i));
          }
          for(int i=0;i<s.length();i++)
          {
              if(s.charAt(i)!='0' && s.charAt(i)!='1')
                  return 1;
          }
         return 0;
      }
}
