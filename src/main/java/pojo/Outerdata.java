package pojo;

public class Outerdata {
	
	private String name;
	private InnerData data;
	
	
	public Outerdata(String name, InnerData data) {
		super();
		this.name = name;
		this.data = data;
	}
	
	
	public String getName() {
		return name;
	}
	public InnerData getData() {
		return data;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setData(InnerData data) {
		this.data = data;
	}
	
	

}
