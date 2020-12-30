package construtorDemo;

public class constructerDemo {
	public static void main(String[] args) {
		student s = new student();
		System.out.println("The student object is called");
		System.out.println(s.name + " " + s.surname);
		System.out.println("Age: " + s.age);
	}
}
