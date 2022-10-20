
class UserDetails{
    private String name, email;  // private fields
    public void setName(String name){ // setName Method sets name
        this.name = name;
    }
    public void setEmail(String email){  // setEmail Method sets email
        this.email = email;
    }
    public String getName(){    // getName Method return the String value
        System.out.print("Name : ");
        return this.name;
    }
    public String getEmail(){   // getEmail Method return the String value
        System.out.print("Email : ");
        return this.email;
    }
}
public class EncapsulationWithNameEmailPrivateFields {
    public static void main(String[]args){
        UserDetails employee1 = new UserDetails();
        employee1.setName("User"); // set name
        employee1.setEmail("example88@gmail.com"); // set Email

        System.out.println(employee1.getName()); // get Name
        System.out.println(employee1.getEmail()); // get Email
    }
}
