public class Car extends Automobile {
	
	private String brand;
	private String model;

	public Car() {
		this.brand = "generic brand";
		this.model = "generic model";
		super.setColor("generic colour");
		super.setPrice(0f);
		super.setYear(1999);
	}
	
	public Car(String brand, String model, String color, Integer year, Float price) {
		this.brand = brand;
		this.model = model;
		super.setColor(color);
		super.setYear(year);
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
