package playload;

public class Computer {

	private int year;
	private int price;
	private String cpu_model;
	private String hardDisk;
	
	
	public Computer(int year, int price, String cpu_model, String hardDisk) {
		super();
		this.year = year;
		this.price = price;
		this.cpu_model = cpu_model;
		this.hardDisk = hardDisk;
	}


	

	public int getYear() {
		return year;
	}


	public int getPrice() {
		return price;
	}


	public String getCpu_model() {
		return cpu_model;
	}


	public String getHardDisk() {
		return hardDisk;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setCpu_model(String cpu_model) {
		this.cpu_model = cpu_model;
	}


	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}


	@Override
	public String toString() {
		return "Computer [year=" + year + ", price=" + price + ", cpu_model=" + cpu_model + ", hardDisk=" + hardDisk
				+ "]";
	}
	

	
}
