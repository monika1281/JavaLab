//Bank Account with Parameterized Constructor: Develop a BankAccount class with fields such as
//accountNumber, holderName, and balance. Include a parameterized constructor to initialize
//these fields. Write a program to create instances of BankAccount using this constructor and
//display their details.

class Test{
	String name;
	int accnum;
	int bal;
	Test(String name,int accnum,int bal){
		this.name=name;
		this.accnum=accnum;
		this.bal=bal;
		}
	}
class Account{
	public static void main(String[] args){
		Test s1 = new Test("MONIKA",1281128980,1290);
		System.out.println(s1.name+" "+s1.accnum+" "+s1.bal);
		
		}
	}

output:
MONIKA 1281128980 1290
