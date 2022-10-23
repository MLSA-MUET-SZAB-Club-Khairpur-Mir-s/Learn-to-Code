package com.mycompany.noor;
import java.util.Scanner;
public class sentence_break_reverse_each 
{//WAP TO INPUT A SENTENCE AND REVERSE EACH WORD
    String str;
    int len;
    String sentence="";
    void input()
    {
       Scanner sc= new Scanner(System.in) ;
       System.out. println("enter a string");
       str=sc.nextLine();
       len=str.length();
    }
    void reveachword()
    {
        String rword="";
        String word="";
        int x;
        char ch;
        int count=0;
        Scanner scc =new Scanner(str);
        while (scc.hasNext())
        {
          word=scc.next();
          x=word.length();
          rword="";
          count++;
           for(int i=x-1;i>=0;i--)
            {
              ch=word.charAt(i);
              rword =rword+ch;
            }//end of for
        System.out.println("reversed  "+rword);   
        sentence=sentence+" "+ rword;
        }// end of while
       System.out.println(sentence);
       System.out.println("Total no of words="+count);
    }
    public static void main(String args[]) 
    {
       sentence_break_reverse_each obj = new sentence_break_reverse_each();
        obj.input();
        obj.reveachword();
    }
}