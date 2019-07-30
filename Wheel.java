package vehicles_fase3;

import java.util.Scanner;

public class Wheel {
	
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		return true;
	}
	private String brand;
	private double diameter;

	public Wheel() {
		
	}
	public void setMeteDatos() {
		System.out.println("Enter the wheel brand");
		brand = scanner.next();
		do {
			System.out.println("Enter the wheel diameter");
			System.out.println("The wheel diameter must be between 0.4 and 4.0");
			diameter = scanner.nextDouble();
		}while(diameter < 0.4 || diameter > 4.0);
		
	}	
	public String creaRueda() {
		return "Brand wheel: " + brand + ", diameter: " + diameter;
	}
	
}
