package myobj;

public class Car {
	int a = 123;
	
	public String name;
	public String brand;
	public int max_speed;
	public int max_fuel;
	public int curr_speed;
	public int curr_fuel;
	
	public void drive() {
		System.out.println("자동차가 " + curr_speed + "km/h의 속도로 움직입니다.");
	}
}
