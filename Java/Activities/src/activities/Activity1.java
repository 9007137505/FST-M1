package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car honda = new Car();
		honda.make = 2014;
		honda.color = "Black";
		honda.transmission = "Manual";
		honda.doors = 4;
		honda.tyres = 4;
		honda.speed = "80 KMPH";
        //Using Car class method
		honda.displayCharacterstics();
		honda.accelerate();
		//honda.brake();
		
		
	}

}
