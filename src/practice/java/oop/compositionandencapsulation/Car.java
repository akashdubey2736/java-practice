package practice.java.oop.compositionandencapsulation;

public class Car {
	
	private String description;
	
	public Car(String description) {
		this.description=description;
	}
	
	public void startEngine() {
		
		System.out.println("Car started!");
		
	}
	
	public void drive() {
		System.out.println("Car is driving, type is "+getClass().getSimpleName());
		runEngine();
		
	}
	
    protected void runEngine() {
    	System.out.println("Engine is running!");
		
	}
    
}

class GasPoweredCar extends Car {
	
	private double avgKmPerLitre;
	private int cylinders;
	
	public GasPoweredCar(String description,double avgKmPerLitre,int cylinders) {
		super(description);
		this.avgKmPerLitre=avgKmPerLitre;
		this.cylinders=cylinders;
	}
	
	public void startEngine() {
		
		System.out.printf("All %d cylinders are fired up, Ready to go!%n",cylinders);
		
	}
	
	
    protected void runEngine() {
    	System.out.printf("Usage exceeds the average: %.2f%n",avgKmPerLitre);
		
	}
	
	
	
	
}

class ElectricCar extends Car {
	
	private double avgKmPerCharge;
	private int batterySize;
	
	public ElectricCar(String description,double avgKmPerCharge,int batterySize) {
		super(description);
		this.avgKmPerCharge=avgKmPerCharge;
		this.batterySize=batterySize;
	}
	
	public void startEngine() {
		
		System.out.printf("Switch %d kWh battery on, ready to go!%n",batterySize);
		
	}
	
	
    protected void runEngine() {
    	System.out.printf("Usage under the average: %.2f%n",avgKmPerCharge);
		
	}
	
	
}

class HybridCar extends Car {
	
	private double avgKmPerLitre;
	private int batterySize;
	private int cylinders;
	
	public HybridCar(String description,double avgKmPerLitre,int batterySize,int cylinders) {
		super(description);
		this.avgKmPerLitre=avgKmPerLitre;
		this.batterySize=batterySize;
		this.cylinders=cylinders;
	}
	
	public void startEngine() {
		
		System.out.printf("All %d cylinders are fired up, Ready to go!%n",cylinders);
		System.out.printf("Switch %d kWh battery on, ready to go!%n",batterySize);
		
	}
	
	
    protected void runEngine() {
    	System.out.printf("Usage below the average: %.2f%n",avgKmPerLitre);
		
	}
	
	
}


