package abstract_factory_design_pattern;


public class Client {

	public static void main(String[] args) {
		
Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
employee.name();
employee.salary();

Employee employee1 = EmployeeFactory.getEmployee(new WebDevFactory());	
employee1.name();
employee1.salary();

	}

}
