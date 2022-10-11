import java.util.Scanner;
public class WebsiteType {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        String company;
        company = new String(sin.next());
        if(company.endsWith(".com")){
            System.out.printf("Your Enter Website %s is Commercial Website", company);
        }
        else if(company.endsWith(".org")){
            System.out.printf("Your Enter Website %s is Organizational Website", company);
        }
        else if(company.endsWith(".pk")){
            System.out.printf("Your Enter Website %s is Pakistani Website", company);
        }
    }
}
