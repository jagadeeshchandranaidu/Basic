import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> employees = new HashMap<>();

         
       employees.put("Jhon", 1);
        employees.put("Tyrion", 2);
         employees.put("Tywin", 3);

         
           System.out.println( employees.get("Jhon"));

         employees.remove("Tywin");

        
    }
}
