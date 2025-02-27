package myobj;

public class Truck extends Car{
	int a = 456;
	
	public int max_cargo;
	public int curr_cargo;
	
	public void addCargo(int cargo) {
		curr_cargo += cargo;
	}
	
	// 부모 클래스에 있던 drive() 메서드를 마음대로 고쳐 사용 (오버라이드)
	public void drive() {
		System.out.println("트럭이 " + curr_speed * 0.8
				+ "km/h의 속도로 이동합니다.");
	}
	
	public void print_a () {
		System.out.println(this.a); //truck
		System.out.println(super.a); //car
		
		super.drive();//car
		this.drive(); //truck
	}
}
