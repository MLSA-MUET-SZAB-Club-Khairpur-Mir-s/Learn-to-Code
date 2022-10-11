import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        float tax=0;
        float income=sin.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if (income >2.5 && income <= 5) {
            tax = tax + 0.05f*(income-2.5f);
        }
        else if(income>5 && income <=10){
            tax = tax + 0.05f * (5 - 2.5f);
            tax = tax + 0.2f   * (income - 5.0f);
        }
        else if(income>10){
            tax = tax + 0.05f * (5 - 2.5f);
            tax = tax + 0.2f   * (10 - 5.0f);
            tax = tax + 0.2f   * (income - 10f);
        }
        System.out.print(tax);
    }
}
