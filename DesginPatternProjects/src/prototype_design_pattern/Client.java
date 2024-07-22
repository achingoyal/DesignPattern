package prototype_design_pattern;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.0.0.1");
		networkConnection.loadImpData();// assume: this data takes time to load
		System.out.println("Original Object");
		System.out.println(networkConnection);
		System.out.println(networkConnection.hashCode());
	
		
		//We want new Object of network connection
		
	
		try {
			
		NetworkConnection networkConnection2 =(NetworkConnection) networkConnection.clone();
		System.out.println("Clone Object 1");
		System.out.println(networkConnection2);
		System.out.println(networkConnection2.hashCode());
		NetworkConnection networkConnection3 =(NetworkConnection) networkConnection.clone();
		System.out.println("Clone Object 2");
		System.out.println(networkConnection3);
		System.out.println(networkConnection3.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
