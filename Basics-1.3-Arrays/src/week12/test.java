package week12;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu, sally;
		
		stu = new Student("Stu Struggler", 20, 40, 42);
		sally = new Student ("Sally Super", 18, 80, 90);
		
		stu.Display();
		sally.Display();
		
		Unit unit1;
		
		unit1 = new Unit ("Programming", "Lewis the Lecturer");
		
		unit1.addStudent(stu);
		unit1.addStudent(sally);
		float results = unit1.unitAverages();
		unit1.Display();
		
	}

}
