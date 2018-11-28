package homework;

public class Computer {
	
	int number = 30;
	static String name = "Joshua";
	static double width = 355.5;
	static String outside = "driveway";
	
	public static void joshua() {
		System.out.println("My name is " + name);
	}
	public void howWideIsTheDriveway() {
		System.out.println("The " + outside + " is " + width + " inches wide ");
	}
	public Computer() {}
	public Computer(String x) {
		System.out.println(x);
	}
	

}
