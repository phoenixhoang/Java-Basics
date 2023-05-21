package week12;

import java.util.ArrayList; //import ArrayList Class

public class Unit {
	
	 String name, lecturer;
	 float ave_mark1, ave_mark2, ave_unit;
	 int class_size;
	 //Array List of Students
	 ArrayList <Student> studentList;
	 
	 //Constructor
	 Unit(String title, String lecturer)
	 {
		 this.name = title;
		 this.lecturer = lecturer;
		 studentList = new ArrayList<Student>(); //empty list
	 }
	 
	 //Overloaded Constructor
	 Unit(String title)
	 {
		 this.name = title;
		 this.lecturer = "Unknown";
		 studentList = new ArrayList<Student>(); //empty list
	 }
	 
	 void addStudent(Student member)
	 {
		 studentList.add(member);
		 class_size++; //class_size = class_size + 1		 
	 }
	 
	 float unitAverages()
	 {
		 int totalMark1 = 0;
		 int totalMark2 = 0;
		 
		 for (Student member: studentList)
		 {
			 //means the same thing
			 totalMark1 += member.mark1;
			 totalMark2 = totalMark2 + member.mark2;
		 }
		 
		 ave_mark1 = (float) totalMark1 / class_size;
		 ave_mark2 = (float) totalMark2 / class_size;
		 ave_unit = (ave_mark1 + ave_mark2) / 2.0f;
	 
		 return ave_unit;
	 }
	 
	 void Display()
	 {
		 System.out.println("Unit Title: " + this.name);
		 //for each student Member in studentList
		 for (Student member : studentList)
		 {
			 member.Display();
		 }
		 System.out.println("Average Mark: " + this.ave_unit);
	 }
	 
}
