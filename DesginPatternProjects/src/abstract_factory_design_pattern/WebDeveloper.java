package abstractfactorydesignpattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		
		return 25000;
	}

	@Override
	public String name() {
	
		return "I am Web Developer";
	}

}
