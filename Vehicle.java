package vehicles_fase2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Vehicle {
	
	Scanner scanner = new Scanner(System.in);

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	protected List<Wheel> frontWheels = new ArrayList<Wheel>();
	protected List<Wheel> backWheels = new ArrayList<Wheel>();

	public Vehicle() {	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backWheels == null) ? 0 : backWheels.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((frontWheels == null) ? 0 : frontWheels.hashCode());
		result = prime * result + ((plate == null) ? 0 : plate.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (backWheels == null) {
			if (other.backWheels != null)
				return false;
		} else if (!backWheels.equals(other.backWheels))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (frontWheels == null) {
			if (other.frontWheels != null)
				return false;
		} else if (!frontWheels.equals(other.frontWheels))
			return false;
		if (plate == null) {
			if (other.plate != null)
				return false;
		} else if (!plate.equals(other.plate))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

	public void setDatosVehiculo() {
		System.out.println("Enter the vehicle brand");
		brand = scanner.next();
		System.out.println("Enter the vehicle plate");
		plate = scanner.next();
		
		char[] validarMatricula = new char[plate.length()];
		ArrayList<Character> numeros = new ArrayList<Character>();
		ArrayList<Character> letras = new ArrayList<Character>();
		
			if(plate.length()==6 || plate.length()==7) {
				validarMatricula = plate.toCharArray();
				
				for(int i=0; i<validarMatricula.length; i++) {
					//System.out.println(validarMatricula[i]);
					if(validarMatricula[i]>='0' && validarMatricula[i]<='9') {
						numeros.add(validarMatricula[i]);	
					} 
					if((validarMatricula[i]>='a'&& validarMatricula[i]<='z')||(validarMatricula[i]>='A'&& validarMatricula[i]<='Z')) {
						letras.add(validarMatricula[i]);
					}
				}
				System.out.println(numeros);
				System.out.println(letras);
				if(numeros.size()!= 4) {
					System.out.println("The plate must have 4 numbers");
					System.exit(0);
				}else if(letras.size()!= 2 && letras.size()!= 3) {
					System.out.println("The plate must have 2 or 3 letters");
				}else {
					System.out.println("Correct plate");
				}
					
			}else {
					System.out.println("This plate is not correct");
			}
		System.out.println("Enter the vehicle color");
		color = scanner.next();
	}
	
	public abstract String getDatosVehiculo();
		
}
