//1)Student Class with Constructor: Create a Student class with fields like name, rollNumber, and
//grade. Implement a constructor to initialize these fields. Write a program to create instances of
//Student using this constructor and display their details.


class Test{
	String name;
	int rollnum;
	char grade;
	Test(String name,int rollnum,char grade){
		this.name=name;
		this.rollnum=rollnum;
		this.grade=grade;
		}
	}
class Student{
	public static void main(String[] args){
		Test s1 = new Test("MONIKA",1281,'A');
		System.out.println(s1.name+" "+s1.rollnum+" "+s1.grade);
		
		}
	}

Output:
MONIKA 1281 A
