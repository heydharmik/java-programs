import construtorDemo.student;
import ordinalGenerate.OrdinalGenerate;

public class JavaAppUsingStaticKeyword {
	
	public static void main(String[] args) {
		student student1 = new student();
		student1.setName("Aniket");
		student1.setSurname("Bhatt");
		student1.setAge(19);
		
		student student2 = new student();
		
		student student3 = new student("Vishal", "Patel", 32);
		
		student student4 = new student("Meet", "Sudani");
		
		System.out.println("Information of " + OrdinalGenerate.ordinal(1) + " student is:");
		System.out.println("Name: " + student1.getName());
		System.out.println("Surname: " + student1.getSurname());
		System.out.println("Age: " + student1.getAge() + "\n");
		
		System.out.println("Information of " + OrdinalGenerate.ordinal(2) + " student is:");
		System.out.println("Name: " + student2.getName());
		System.out.println("Surname: " + student2.getSurname());
		System.out.println("Age: " + student2.getAge() + "\n");
		
		System.out.println("Information of " + OrdinalGenerate.ordinal(3) + " student is:");
		System.out.println("Name: " + student3.getName());
		System.out.println("Surname: " + student3.getSurname());
		System.out.println("Age: " + student3.getAge() + "\n");
		
		System.out.println("Information of " + OrdinalGenerate.ordinal(4) + " student is:");
		System.out.println("Name: " + student4.getName());
		System.out.println("Surname: " + student4.getSurname());
		System.out.println("Age: " + student4.getAge() + "\n");
		
		System.out.println("Total number of students are :" + student.getCounter());
	}

}
