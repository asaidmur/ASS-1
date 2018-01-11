public class Truck extends Automobile {

	private String brand;
	private String model;
	

	public Truck() {
		this.brand = "generic brand";
		this.model = "generic model";
		super.setColor("generic colour");
		super.setPrice(0f);
		super.setYear(1999);
	}
	
	public Truck(String brand, String model, String color, Integer year, Float price) {
		this.brand = brand;
		this.model = model;
		super.setYear(year);
		super.setColor(color);
		super.setPrice(price);
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
