

class Member{
    String first_name, last_name, CNIC, PhoneNumber, Address;
    byte age;
    long Salary;
}
class Employee extends Member{
        String specialization;
        String department;

        public void details(){
            System.out.println("First Name : " + first_name );
            System.out.println("Last Name : " + last_name );
            System.out.println("CNIC : " + CNIC );
            System.out.println("Phone Number : " + PhoneNumber );
            System.out.println("Address : " + Address );
            System.out.println("Age : " + age );
            System.out.println("Salary : " + Salary );
        }
}
class Manager extends Member{
        String specialization;
        String department;

        public void details(){
        System.out.println("First Name : " + first_name );
        System.out.println("Last Name : " + last_name );
        System.out.println("CNIC : " + CNIC );
        System.out.println("Phone Number : " + PhoneNumber );
        System.out.println("Address : " + Address );
        System.out.println("Age : " + age );
        System.out.println("Salary : " + Salary );
    }
}
public class MemberManagerInheritanceGreatExample {
    public static void main(String[] args) {
        Employee employeeObj = new Employee();
        Manager managerObj = new Manager();
        employeeObj.first_name = "First_Name";
        employeeObj.last_name = "Last_Name";
        employeeObj.specialization = "Specialization";
        employeeObj.department = "Department";
        employeeObj.CNIC = "45678456690";
        employeeObj.PhoneNumber = "0987654456";
        employeeObj.Address = "Address";
        employeeObj.age = 68;
        employeeObj.Salary = 987654;

        Manager managerObj = new Manager();
        managerObj.first_name = "First_Name";
        managerObj.last_name = "Last_Name";
        managerObj.specialization = "Specialization";
        managerObj.department = "Department";
        managerObj.CNIC = "45678456690";
        managerObj.PhoneNumber = "0987654456";
        managerObj.Address = "Address";
        managerObj.age = 68;
        managerObj.Salary = 987654;

        System.out.println("*** Employee Details ***");
        employeeObj.details();

        System.out.println();

        System.out.println("*** Manager Details ***");
        managerObj.details();
    }
}
