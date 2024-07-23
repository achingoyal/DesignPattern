package prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	NetworkConnection networkConnetion = new NetworkConnection();
	networkConnetion.setIp(this.getIp());
	networkConnetion.setData(this.getData());
	
	for(String d: this.getDomains()) {
		networkConnetion.getDomains().add(d);
	}
		return networkConnetion;
	}
	private String ip;
	private String data;
	private List<String> domains = new ArrayList<>(); 
	
	
	
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
	
	
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	 
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", data=" + data + ", domains=" + domains + "]";
	}
	public void  loadImpData() throws InterruptedException {
		this.data="Very very Complex and imp data";
		domains.add("www.achingoyal.com");
		domains.add("www.google.com");
		domains.add("www.facebook.com");
		domains.add("www.gmail.com");
		Thread.sleep(5000);
	}

}
