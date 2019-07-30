package vehicles_fase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Vehicle {
	
	Scanner scanner = new Scanner(System.in);

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((letras == null) ? 0 : letras.hashCode());
		result = prime * result + ((numeros == null) ? 0 : numeros.hashCode());
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
		if (letras == null) {
			if (other.letras != null)
				return false;
		} else if (!letras.equals(other.letras))
			return false;
		if (numeros == null) {
			if (other.numeros != null)
				return false;
		} else if (!numeros.equals(other.numeros))
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

	private ArrayList<Character> numeros = new ArrayList<Character>();
	private ArrayList<Character> letras = new ArrayList<Character>();
	
	public Vehicle() {	
	}
	
	
	
	

	public void setDatosVehiculo() {
		System.out.println("Enter the vehicle brand");
		brand = scanner.next();
		do {
		System.out.println("Enter the vehicle plate");
		plate = scanner.next();
		
		char[] validarMatricula = new char[plate.length()];
		
				validarMatricula = plate.toCharArray();
				numeros.clear();
				letras.clear();
				for(int i=0; i<validarMatricula.length; i++) {
					
					if(validarMatricula[i]>='0' && validarMatricula[i]<='9') {
						numeros.add(validarMatricula[i]);	
					} 
					if((validarMatricula[i]>='a'&& validarMatricula[i]<='z')||(validarMatricula[i]>='A'&& validarMatricula[i]<='Z')) {
						letras.add(validarMatricula[i]);
					}
				}
				//System.out.println(numeros.size());
				//System.out.println(letras.size());
					
			}while((numeros.size()!= 4) || (letras.size()!= 2 && letras.size()!= 3));
					
			
		System.out.println("Enter the vehicle color");
		color = scanner.next();
	}
	
	public abstract String getDatosVehiculo();
		
}
