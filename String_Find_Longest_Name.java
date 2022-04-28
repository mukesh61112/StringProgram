package com.company;

import java.util.Scanner;

public class String_Find_Longest_Name {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          String arr[]=new String[n];
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.next();
          }
          ChechLongestName obj=new ChechLongestName();
          System.out.print(obj.checkLongestName(arr,n));
    }
}
class ChechLongestName{
      String checkLongestName(String arr[],int n)
      {
          int index=0,len=0;
          for(int i=0;i<n;i++)
          {
              String s=arr[i];
              int length=s.length();
              if(length>len)
              {
                  len=length;
                  index=i;
              }
          }
          return arr[index];
      }
}
