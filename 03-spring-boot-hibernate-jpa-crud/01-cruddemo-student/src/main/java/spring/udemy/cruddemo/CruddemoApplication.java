package spring.udemy.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.udemy.cruddemo.dao.StudentDAO;
import spring.udemy.cruddemo.entity.Student;


@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	// Bean annotation indicated to spring boot that the method returns a bean that needs initialising and managing by spring
	// This method returns an implementation of CommandLineRunner (a start-up task)
	// Spring boot will call the run() method of CLRs after the application context has been initialised
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		// Shorthand for returning an implementation of CLR, a functional interface
		// The method in the implementing class 'run' just prints hello world
		return runner -> {
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			displayAllTheStudents(studentDAO);
		};
	}

	private void displayAllTheStudents(StudentDAO studentDAO) {
		System.out.println(studentDAO.findByLastName("burger van"));
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("creating student...");
		Student newStudent = new Student("lew", "burger van", "lewburgers@burgervanman.com");

		// save the student
		studentDAO.save(newStudent);

		// print the id of the saved student
		// id of the student only available after it has been persisted to the database, as it is the database that generated this value
		int studentID = newStudent.getId();
		System.out.println("Id of created student just created and saved: " + studentID);

		// retrieve student using the student id
		Student studentRetrieved = studentDAO.findById(studentID);

		// display the retrieved student
		System.out.println(studentRetrieved);
	}

	private void createMultipleStudents(StudentDAO studentDAO){
		for (int i = 0; i < 3; i++){
			createStudent(studentDAO);
		}
	}

	private void createStudent(StudentDAO studentDAO) {
		// Create new student to save
		System.out.println("Creating new student");
		Student tempStudent = new Student("foo@email.com", "Burgess", "llolly");

		// Save the student using the data access object
		System.out.println("Saving the student using the dao...");
		studentDAO.save(tempStudent);

		// printing out the id of the student
		System.out.println("id of saved student: " + tempStudent.getId());
	}
}
