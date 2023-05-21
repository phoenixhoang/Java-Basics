package week12;

public class Student {
//members
	String name;
	int age, mark1, mark2;
	
	//Constructor - all info
	Student (String name, int age, int mark1, int mark2)
	{
		this.name = name;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	//Overloaded Constructor - partial info available
	Student (String name)
	{
		this.name = name;
		this.age = 18;
	}
	
	void Display()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Marks: " + mark1 + " and " + mark2);
	}
	
}
