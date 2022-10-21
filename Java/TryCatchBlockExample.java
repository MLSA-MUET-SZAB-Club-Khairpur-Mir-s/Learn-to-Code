public class TryCatchBlockExample {  
  
    public static void main(String[] args) {  
          try{
        int number=50/0; //may throw exception   
          }
      catch(Exception e){
        System.out.println("rest of the code");  
      }
    }  
      
}  
