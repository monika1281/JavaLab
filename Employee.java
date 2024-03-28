//5)Employee Class with Constructor Overloading: Define an Employee class with fields like name, id,
//and salary. Implement multiple constructors including a default constructor, a parameterized
//constructor, and a constructor that initializes only the name and sets default values for other
//attributes. Write a program to create instances of Employee using these constructors and display
//their details.
public class Employee{
	String name;
	int id;
	int salary;
	
	Employee(String name){
		this();
		this.name=name;
		
	}
	Employee(){
		System.out.println("No Args");
		System.out.println(id+" "+salary);
		
	}
	public static void main(String[] args){
		Employee t = new Employee("Bindhu");
		System.out.println(t.name);
		
		
	}
}
