package vehicles_fase3;

public class Bike extends Vehicle {

	public Wheel wheelF = new Wheel();
	public Wheel wheelB = new Wheel();
	
	public Bike() {
		super();
	}
	
	public String getDatosVehiculo() {
		return "This bike is of the brand " + brand + ",it is " + color + " and the license plate is the " + plate;	
	}
	public void addFrontWheel() {
		
		System.out.println("FRONT WHEEL");
		wheelF.setMeteDatos();
		System.out.println(wheelF.creaRueda());
		
		}
	public void addBackWheel() {
		
		System.out.println("BACK WHEEL");
		wheelB.setMeteDatos();
		System.out.println(wheelB.creaRueda());
		
		}
		

	

}
