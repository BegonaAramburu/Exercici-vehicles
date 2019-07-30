package vehicles_fase1;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
	
	public Wheel rightWheelF = new Wheel();
	public Wheel leftWheelF = new Wheel();
	public Wheel rightWheelB = new Wheel();
	public Wheel leftWheelB = new Wheel();
	
	public List<Wheel> frontWheels = new ArrayList<Wheel>();
	public List<Wheel> backWheels = new ArrayList<Wheel>();
	
	public Car() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((backWheels == null) ? 0 : backWheels.hashCode());
		result = prime * result + ((frontWheels == null) ? 0 : frontWheels.hashCode());
		result = prime * result + ((leftWheelB == null) ? 0 : leftWheelB.hashCode());
		result = prime * result + ((leftWheelF == null) ? 0 : leftWheelF.hashCode());
		result = prime * result + ((rightWheelB == null) ? 0 : rightWheelB.hashCode());
		result = prime * result + ((rightWheelF == null) ? 0 : rightWheelF.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (backWheels == null) {
			if (other.backWheels != null)
				return false;
		} else if (!backWheels.equals(other.backWheels))
			return false;
		if (frontWheels == null) {
			if (other.frontWheels != null)
				return false;
		} else if (!frontWheels.equals(other.frontWheels))
			return false;
		if (leftWheelB == null) {
			if (other.leftWheelB != null)
				return false;
		} else if (!leftWheelB.equals(other.leftWheelB))
			return false;
		if (leftWheelF == null) {
			if (other.leftWheelF != null)
				return false;
		} else if (!leftWheelF.equals(other.leftWheelF))
			return false;
		if (rightWheelB == null) {
			if (other.rightWheelB != null)
				return false;
		} else if (!rightWheelB.equals(other.rightWheelB))
			return false;
		if (rightWheelF == null) {
			if (other.rightWheelF != null)
				return false;
		} else if (!rightWheelF.equals(other.rightWheelF))
			return false;
		return true;
	}

	public String getDatosVehiculo() {
		return "This car is of the brand " + brand + ",it is " + color + " and the license plate is the " + plate;	
	}
	
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		this.frontWheels = frontWheels;
		this.backWheels = backWheels;
		//addTwoWheels(frontWheels);
		//addTwoWheels(backWheels);
	}
	
	public void addTwoFrontWheels() throws Exception {
		
		System.out.println("FRONT RIGHT WHEEL");
		rightWheelF.setMeteDatos();
		System.out.println(rightWheelF.creaRueda());
		
		System.out.println("FRONT LEFT WHEEL");
		leftWheelF.setMeteDatos();
		System.out.println(leftWheelF.creaRueda());
		
		if (!rightWheelF.equals(leftWheelF))
			throw new Exception();
		
		frontWheels.add(0,rightWheelF);
		frontWheels.add(1,leftWheelF);
		
		if (frontWheels.size() != 2) {
			throw new Exception();
		}
	}
		public void addTwoBackWheels() throws Exception {
			
			System.out.println("BACK RIGHT WHEEL");
			rightWheelB.setMeteDatos();
			System.out.println(rightWheelB.creaRueda());
			
			System.out.println("BACK LEFT WHEEL");
			leftWheelB.setMeteDatos();
			System.out.println(leftWheelB.creaRueda());
			
			if (!rightWheelB.equals(leftWheelB))
				throw new Exception();
			
			backWheels.add(0,rightWheelB);
			backWheels.add(1,leftWheelB);
			
			if (backWheels.size() != 2) {
				throw new Exception();
		}
	
		}
		
}
	

