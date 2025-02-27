package myobj;

public class Grape extends Fruit {
	public String color = "violet";

	public Grape() {
		super("purple");		
	}
	public void print() {
		System.out.println(this.color + ": this");
		System.out.println(super.color + ": super");
	}
}
