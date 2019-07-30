package vehicles_fase3;

import java.util.Scanner;

public class Use_vehicle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("What do you want to introduce? \n 1. The car dates \n 2. The bike dates");
		int opcion = scanner.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("CAR DATES");
			Car myCar = new Car();
			myCar.setDatosVehiculo();
			System.out.println(myCar.getDatosVehiculo());
		
			try {
				myCar.addTwoBackWheels();
			}catch(Exception e) {
				System.out.println("These wheels must be the same");
			}
			try {
				myCar.addTwoFrontWheels();
			}catch(Exception e) {
				System.out.println("These wheels must be the same");
			}
			break;
			
		case 2:
			System.out.println("BIKE DATES");
			Bike myBike = new Bike();
			myBike.setDatosVehiculo();
			System.out.println(myBike.getDatosVehiculo());
			myBike.addFrontWheel();
			myBike.addBackWheel();
			break;
		
		default:
			System.out.println("Error");
		
		}
	}

}
