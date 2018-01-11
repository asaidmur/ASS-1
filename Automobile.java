public class Automobile {

	private String color;
	private Integer year;
	private Float price;
	
	private boolean started;
	private boolean accelerating;
	
	public Automobile() {
		super();
	}
	
	public Automobile(String color, Integer year, Float price) {
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	public void start() {
		System.out.println("starting...");
		setStarted(true);
	}
	
	public void stop() {
		System.out.println("stopping...");
		setStarted(false);
	}
	
	public void accelerate() {
		System.out.println("accelerating...");
		setAccelerating(true);
	}
	
	public void decelerate() {
		System.out.println("decelerating...");
		setAccelerating(false);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	
	public boolean isStarted() {
		return started;
	}

	private void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isAccelerating() {
		return accelerating;
	}

	private void setAccelerating(boolean accelerating) {
		this.accelerating = accelerating;
	}
	
	
}
