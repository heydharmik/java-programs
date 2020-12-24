public class SimpleClassAndObject{
	String name;
	String surname;
	int age;
	String gender;
	float weight;
	
	public static void main(String[] args) {
		SimpleClassAndObject student1 = new SimpleClassAndObject();
		SimpleClassAndObject student2 = new SimpleClassAndObject();
		
//		it is not recommended to assign the values directly
		student1.name = "Dharmik";
		student1.surname = "Pajwani";
		student1.age = 18;
		student1.gender = "Male";
		student1.weight = (float) 32.12;
		
		student2.name = "Zaid";
		student2.surname = "Marfani";
		student2.age = 20;
		student2.gender = "Male";
		student2.weight = (float) 88.99;
		
		System.out.println("Full Name: "+student1.name+" "+student1.surname);
		System.out.println("Age: "+student1.age);
		System.out.println("Gender:"+student1.gender);
		System.out.println("Weight: "+student1.weight);
		System.out.println();
		System.out.println("Full Name: "+student2.name+" "+student2.surname);
		System.out.println("Age: "+student2.age);
		System.out.println("Gender:"+student2.gender);
		System.out.println("Weight: "+student2.weight);
	}
}