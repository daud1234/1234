package student;

public class Student {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		add();
		addition();
		name();
		division();
		subtraction();
		multiplication();
	}
	public static void add() {
		System.out.println("Dhaka");
		System.out.println("Rajshahi");
		System.out.println(10+20);
	}
	public static void addition() {
		double x=10.00;
		double y=20.90;
		double z=0.00;
		z=x+y;
		System.out.println("add"+z);

	}
	
	public static void name() {
		String v="Daud Khan";
		System.out.println("name "+v);
	}
	
	public static void subtraction() {
		double x=10.00;
		double y=20.90;
		double z=0.00;
		z=x-y;
		System.out.println("sub "+z);
	}
	
	public static void multiplication() {
		double x=10.00;
		double y=20.90;
		double z=0.00;
		z=x*y;
		System.out.println("mul "+z);
	}
	
	public static void division() {
		double x=10.00;
		double y=20.90;
		double z=0.00;
		z=x/y;
		System.out.println("div "+z);
	}
}
