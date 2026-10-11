package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {
	private List<Student> studentRoster;
	
	private List<Person> personRoster;
	
	public School() {
		studentRoster=new ArrayList<>();
		personRoster=new ArrayList<>();
		
	}
	public void addStudent(Student student) {
		studentRoster.add(student);
		personRoster.add(student);
	}
	public void sortStudentById() {
		Collections.sort(this.studentRoster, new OrderById());
		
	}
	public void sortStudentByAge() {
		Collections.sort(this.studentRoster, new OrderByAge());
	}
	public void sortStudentByLastName() {
		Collections.sort(this.studentRoster, new OrderByLastName());

		
	}
	public void sortStudentByGpa() {
		studentRoster.sort(Comparator.comparing(Student::getGpa));
	}
	@Override
    public String toString() {
        StringBuilder result = new StringBuilder();

//        result.append();
        for (Person person : personRoster) {
            result.append(person.toString()).append(" \n");
        }
	result.append("Student Roster:\n");
        for (Student student : studentRoster) {
            result.append(student.toString()).append(" \n");
        }
        result.append("\n");
        return result.toString();




	}
	public void sortStudentsByID() {
		Collections.sort(this.studentRoster, new OrderById());
	}
	public void sortStudentsByAge() {
		Collections.sort(this.studentRoster, new OrderByAge());
	}
	public void sortStudentsByLastName() {
		Collections.sort(this.studentRoster, new OrderByLastName());		
	}
	public void sortStudentsByGPA() {
		Collections.sort(this.studentRoster, new OrderByGpa());
	}
}
