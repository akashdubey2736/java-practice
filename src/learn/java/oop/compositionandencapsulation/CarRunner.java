package learn.java.oop.compositionandencapsulation;

public class CarRunner {

	public static void main(String[] args) {
		
		Car car=new Car("2022 Red Lamborgini");
		runRace(car);
		
		Car lambo=new GasPoweredCar("2022 Red Lamborgini",250,6);
		runRace(lambo);
		
		Car tesla=new ElectricCar("2022 Black Tesla",500,75);
		runRace(tesla);
		
		Car elantra=new HybridCar("2025 Blue Elantra",250,70,6);
		runRace(elantra);
		
}
	
	public static void runRace(Car car) {
		
		car.startEngine();
		car.drive();
		
	}

}
