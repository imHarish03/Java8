package lab.basic.Java8.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Applicaton {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(6, "Yash", "Chopra", 25));
		employees.add(new Employee(2, "Aman", "Sharma", 28));
		employees.add(new Employee(3, "Aakash", "Yaadav", 52));
		employees.add(new Employee(5, "David", "Kameron", 19));
		employees.add(new Employee(4, "James", "Hedge", 72));
		employees.add(new Employee(8, "Balaji", "Subbu", 88));
		employees.add(new Employee(7, "Karan", "Johar", 59));
		employees.add(new Employee(1, "Lokesh", "Gupta", 32));
		employees.add(new Employee(9, "Vishu", "Bissi", 33));
		employees.add(new Employee(10, "Lokesh", "Ramachandran", 60));

		// Sort all employees by first name
		employees.sort(Comparator.comparing(e -> e.getFirstName()));

		// OR you can use below
		employees.sort(Comparator.comparing(Employee::getFirstName));

		// Let's print the sorted list
		System.out.println(employees);

		// Sort all employees by first name; And then reversed
		Comparator<Employee> comparator = Comparator.comparing(e -> e.getFirstName());
		employees.sort(comparator.reversed());

		System.out.println("***********Reversed Order***********");
		// Let's print the sorted list
		System.out.println(employees);

		// Sorting on multiple fields; Group by.
		System.out.println("***********Multiple Sorting***********");
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);
		employees.sort(groupByComparator);

		System.out.println(employees);
	}
}
