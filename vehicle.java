//Vehicle Class with Default and Parameterized Constructors: Design a Vehicle class with attributes
//like make, model, and year. Implement both default and parameterized constructors. Write a
//program to create instances of Vehicle using these constructors and display their details.
import java.util.Scanner;
class Test{
	String model;
	int year;
	int since;
	Test(String model,int year,int since){
		this();
		System.out.println("PARAMETERIZED CONSTRUCTORS");
		this.model=model;
		this.year=year;
		this.since=since;
		}
	Test(){
		System.out.println("DEFAULT CLASS");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter make:");
		String make=sc.next();
		System.out.println(make);
		
	}
}
class vehicle{
	public static void main(String[] args){
		Test s1 = new Test("Audi",2005,1990);
		System.out.println(s1.model+" "+s1.year+" "+s1.since);
		
		}
	}
output:
DEFAULT CLASS
enter make:
swift
swift
PARAMETERIZED CONSTRUCTORS
Audi 2005 1990

