package construtorDemo;

public class student {
	String name;
	String surname;
	int age;
	static int counter;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	  public static int getCounter() {
		return counter;
	}



	public static void setCounter(int counter) {
		student.counter = counter;
	}



	public student() { 
		  this.name = "Dharmik"; 
		  this.surname = "Pajwani"; 
		  this.age = 18;
		  counter++;
	  }
	  
	  public student(String name, String surname, int age) {
		  this.name = name;
		  this.surname = surname;
		  this.age = age;
		  counter++;
	  }
	  
	  public student(String name, String surname) {
		  this.name = name;
		  this.surname = surname;
		  this.age = 20;
		  counter++;
	  }
	  
	  
	 
	 
}
