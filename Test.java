
public final class Test {
	
	static String CAR = "car";
	static String TRUCK = "truck";
	static int BUFFER_SPACE = 3;
	static String BRAND_TRUCK = "Chevrolet";
	static String BRAND_CAR = "Tesla";
	static String MODEL_TRUCK = "Silverado";
	static String MODEL_CAR = "Model S";
	static String COLOR_TRUCK = "Autumn Gold";
	static String COLOR_CAR = "Space Black";
	static Integer YEAR = 2010;
	static Float PRICE = 9999f;
	
	public static void main(String[] args) {
		
		printAutomobile(CAR);
		bufferSpace();
		printAutomobile(TRUCK);
		
	}
	
	public static void printAutomobile(String auto) {
		switch (auto) {
		
		case "car":
			
			System.out.println("Creating new car!");
//			Car car = new Car(BRAND_CAR, MODEL_CAR, COLOR_CAR, YEAR, PRICE);
			Car car = new Car();
			printProperties(car);
			
			break;
			
		case "truck":
			
			System.out.println("Creating new truck!");
			Truck truck = new Truck(BRAND_TRUCK, MODEL_TRUCK, COLOR_TRUCK, YEAR, PRICE);
			printProperties(truck);
			
			break;
		}
		
	}

	private static void bufferSpace() {
		int i = 0;
		while (i < BUFFER_SPACE) {
			System.out.println();
			i++;
		}
	}
	
	
	private static void printProperties(Car car) {
		
		car.start();
		car.stop();
		car.decelerate();
		car.accelerate();
		
		System.out.println("And now for the properties of the Car");

		System.out.println("Color: " + car.getColor());
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Model: " + car.getModel());
		System.out.println("Price: " + car.getPrice());
		System.out.print("Year: " + car.getYear());

	}
	
	private static void printProperties(Truck truck) {
		
		truck.start();
		truck.accelerate();
		truck.decelerate();
		truck.stop();
		
		System.out.println("And now for the properties of the Truck");

		
		System.out.println("Color: " + truck.getColor());
		System.out.println("Brand: " + truck.getBrand());
		System.out.println("Model: " + truck.getModel());
		System.out.println("Price: " + truck.getPrice());
		System.out.print("Year: " + truck.getYear());

	}

}
