package pojo;

public class InnerData {

	
	private int year;
	private float price;
	private String cpuModel;
	private String hardDisk;
	
	public InnerData(int year, float price, String cpuModel, String hardDisk) {
		super();
		this.year = year;
		this.price = price;
		this.cpuModel = cpuModel;
		this.hardDisk = hardDisk;
	}
	
	
	
	public int getyear() {
		return year;
		
	}
	
	public float getprice() {
		return price;
	}


	public String getCpuModel() {
		return cpuModel;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}



	@Override
	public String toString() {
		return "InnerData [year=" + year + ", price=" + price + ", cpuModel=" + cpuModel + ", hardDisk=" + hardDisk
				+ "]";
	}
	
	
}
