import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class EmployeeStream {
	// final static int INCREMENT_AGE = 10;
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();

		addEmployees(employees);

		// 1 . employess with age greater than 20
		List<Employee> ageFilter = employees.stream().filter(e -> e.getAge() > 20).collect(Collectors.toList());
		System.out.println("employee with age greater than 20");
		ageFilter.forEach(System.out::println);

		// 2 . list all employee whose names start wITH n
		List<Employee> nameFilter = employees.stream().filter(e -> e.getName().startsWith("N"))
				.collect(Collectors.toList());
		System.out.println("employee with Nnames with letter n");
		nameFilter.forEach(System.out::println);

		// 3. increase in salary by 15%
		List<Employee> salMap = employees.stream().map(e -> {
			e.setSalary(e.getSalary() + e.getSalary() * 115);
			return e;
		}).collect(Collectors.toList());
		System.out.println("******new salary******");
		salMap.forEach(System.out::println);

		// 4 inc age by 10 years
		List<Employee> ageMap = employees.stream().map(e -> {
			e.setAge(e.getAge() + 10);
			return e;
		}).collect(Collectors.toList());
		System.out.println("******new Age******");
		ageMap.forEach(System.out::println);

		// 5 add mr to odd and miss even
		List<Employee> name = employees.stream().map(e -> {
			if (e.getId() % 2 != 0) {
				e.setName("Mr. " + e.getName());
			} else {
				e.setName("Miss " + e.getName());
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println("******new name******");
		name.forEach(System.out::println);

	}

	private static void addEmployees(ArrayList<Employee> employees) {

		Employee emp1 = new Employee(4234, "Veera", "Bangalore", "Developer", 20, 1234561123, 2000);
		Employee emp2 = new Employee(2324, "Neeraja", "Mumbai", "Software Engineer", 21, 234341212, 12131);
		Employee emp3 = new Employee(9987, "Sashi", "Indore", "Test Engineer", 19, 1988912123, 97987);
		Employee emp4 = new Employee(1234, "Neha", "Pune", "DevOps Engineer", 23, 689081231, 43432);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
	}

}
