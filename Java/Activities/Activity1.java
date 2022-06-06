package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.Color="Black";
		car.make=2014;
		car.transmission="Manual";
		
		car.displayCharacteristic();
		car.accelerate();
		car.brake();
		
	}

}
