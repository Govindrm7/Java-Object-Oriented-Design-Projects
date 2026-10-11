package edu.neu.csye6200;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) {

        

    	String refpath="";
		try {
			refpath = new File(".").getCanonicalPath();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String studentDataPath = refpath+"/src/main/java/edu/neu/csye6200/student.csv";
		School school = new School();

        try (BufferedReader reader = new BufferedReader(new FileReader(studentDataPath))) {
        	
    		
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");


                if (parts.length == 7) {

                    int id = Integer.parseInt(parts[0]);
                    String firstName = parts[1];

                    String lastName = parts[2];

                    int age = Integer.parseInt(parts[3]);

                    double gpa = Double.parseDouble(parts[4]);

                    String parentFirstName = parts[5].trim();

                    String parentLastName = parts[6].trim();

                    Student student = new Student(id, firstName, lastName, age, gpa);

                    Parent parent = new Parent(parentFirstName, parentLastName);

                    student.setParent(parent);


                    school.addStudent(student);
                    
                }
            }
            school.sortStudentsByID();
	        System.out.println("Sorted by ID:" + school.toString());
	
	
	        school.sortStudentsByAge();
	        System.out.println("Sorted by Age:" + school.toString());
	
	
	        school.sortStudentsByLastName();
	        System.out.println("Sorted by Last Name:" + school.toString());
	
	
	        school.sortStudentsByGPA();
	        System.out.println("Sorted by GPA:" + school.toString());
	        System.out.println();
	        
	        reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

		        
    }
}
