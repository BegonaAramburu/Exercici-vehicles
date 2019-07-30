package vehicles_fase1;

public class Use_vehicle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	}

}
