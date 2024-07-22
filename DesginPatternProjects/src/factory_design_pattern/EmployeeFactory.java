package factorydesign;

public class EmployeeFactory {
	
	//get Employee type
	
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("Python Developer")) {
			return new PythonDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("Java Developer")) {
			return new JavaDeveloper();
		}
		else {
			return null;
		}
		
	
	}

}
