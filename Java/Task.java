class Testing{   
        
    private int number1;
    private int number2;
    private int number3;
    int multiplication;
    int divide; 

    public Testing(){
        number1=0;
        number2=0;
        number3=0;
    }

    Testing(int a,  int b, int c){
        number1=a;
        number2=b;
        number3=c;
    }
    //sum method
    public void sum(){
        System.out.println(" Sum of number1 and number2 is ="+(number1+number2));
    }
    //subtract method
    public void subtract(){
        System.out.println(" Subtraction of number1 and number2 is ="+(number1-number2));
    }
    //multiplication method
    public void multip(){
        while(number2>0){
            multiplication=multiplication+number1;
            number2--;
        }
        System.out.println(" Multiplication of number1 and number2 is ="+(multiplication));            
    }
    //division method
    public void division(){
        while(number1>=number3){
            number1=number1-number3;
            divide++;
        }
        System.out.println(" Division of number1 and number3 is ="+(divide));
    }
    //Setter...
    public void setnumber1(int a){
        this.number1=a;
    }
    public void setnumber2(int b){
        this.number2=b;
    }
    public void setnumber3(int c){
        this.number3=c;
    }
    //Getter...
    public int getnumber1(){
        return number1;
    }
    public int getnumber2(){
        return number2;
    }
    public int getnumber3(){
        return number3;
    }
}    
    

class task{
    public static void main (String args[]){
        Testing operations=new Testing();
        System.out.print(" The value of number1 is =");
        operations.setnumber1(20);
        System.out.println(operations.getnumber1());
        System.out.print(" The value of number2 is =");
        operations.setnumber2(10);
        System.out.println(operations.getnumber2());
        System.out.print(" The value of number3 is =");
        operations.setnumber3(10);
        System.out.println(operations.getnumber3());

        operations.sum();
        operations.subtract();
        operations.multip();
        operations.division();

    }
}
