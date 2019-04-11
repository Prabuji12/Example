
public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Car();
		obj.print();
	}

}
interface Vehicle {
	default void print() {
		System.out.println("I am Vehicle");
	}
}
interface FourWheeler {
	default void print() {
		System.out.println("I am FourWheeler");
	}
}
class Car implements Vehicle,FourWheeler {
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		System.out.println("I am Car");
	}
}
