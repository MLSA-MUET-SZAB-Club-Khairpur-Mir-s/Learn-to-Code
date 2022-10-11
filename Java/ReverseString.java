
public class ReverseString{
  public String reverseString(String str){  
  if(str.isEmpty()){  
 System.out.println("string without Numbers.") ; 
 return str;  
 }   
 else{  
 return reverseString(str.substring(1))+str.charAt(0);  
 }  
 }  
 public static void main(String[] args){  
 ReverseString rs = new ReverseString();  
 String resultantSting1 = rs.reverseString("Ameer");  
 String resultantSting2 = rs.reverseString("Ali");  
 String resultantSting3 = rs.reverseString("MUET-SZAB");  
 System.out.println(resultantSting1);  
 System.out.println(resultantSting2);  
 System.out.println(resultantSting3);   
 }  
 }
