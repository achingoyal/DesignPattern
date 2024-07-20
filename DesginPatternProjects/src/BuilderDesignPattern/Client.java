package BuilderDesignPattern;

public class Client {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder().setEmailId("achin@gmail.com").setUserId("USer123").setUserName("Achin").build();
		System.out.println(user);
	
		User user2 = User.UserBuilder.builder().setEmailId("Sachin@gmail.com").setUserId("USER234").setUserName("Sachin").build();
		System.out.println(user2);
		

	}

}
