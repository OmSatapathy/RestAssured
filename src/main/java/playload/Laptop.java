package playload;

public class Laptop {
	
	private String name;
	private Computer data;
	
	public Laptop(String name, Computer data) {
		super();
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public Computer getData() {
		return data;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(Computer data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", data=" + data + "]";
	}


	
	

}
