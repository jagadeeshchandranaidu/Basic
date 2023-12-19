package Arraylist;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList();
		
		Employee employee1 = new Employee(1,"jhon","jhon@gmail.com");
		
		Employee employee2 = new Employee(2,"robb","robb@gmail.com");
		
		Employee employee3 = new Employee(3,"arya","arya@gmail.com");
		
		Employee employee4 = new Employee(1,"ned","ned@gmail.com");
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		for(int i=0; i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		
		System.out.println();
		
		employees.remove(3);
		employees.remove(0);
		
		for(int i=0; i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		
		System.out.println(employees.contains(employee2));
		
		System.out.println(employees.get(1).getEmail());
		System.out.println(employees.get(1).getEmail().toUpperCase());
		
		
	}
}
