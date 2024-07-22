package prototypedesignpattern;

public class NetworkConnection implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	private String ip;
	private String data;
	
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", data=" + data + "]";
	}
	public void  loadImpData() throws InterruptedException {
		this.data="Very very Complex and imp data";
		Thread.sleep(5000);
	}

}
