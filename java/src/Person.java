interface student {

	public int numberOfSubjects();

	public int numberOfPracticals();

	public int numberOfChapters();
}

interface professor {

	public int numberOfStudents();
}

public class Person implements student, professor {
	public int numberOfSubjects() {
		int sub = 4;
		System.out.println("\"Subjects\" taken by students: " + sub);
		return sub;
	}

	public int numberOfPracticals() {
		int prac = 3;
		System.out.println("\"Practicals\" Performed by students: " + prac);
		return prac;
	}

	public int numberOfStudents() {
		int stu = 90;
		System.out.println("\"Students\" per class of a teacher: " + stu);
		return stu;
	}

	public int numberOfChapters() {
		int chap = 10;
		System.out.println("\"Chapters\" studied by students: " + chap);
		return chap;
	}
}