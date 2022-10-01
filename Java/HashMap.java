import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    // Creating a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();

    // Add keys and values (Name, Age)
    people.put("Fahad", 21);
    people.put("Muzamil", 30);
    people.put("Noor", 33);

    for (String i : people.keySet()) {
      System.out.println("Name: " + i + " Age: " + people.get(i));
    }
  }
}
