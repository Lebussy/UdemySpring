package spring.udemy.cruddemo.dao;

import spring.udemy.cruddemo.entity.Student;

import java.util.List;

// This Data Access Object (DAO) interface for the @Entity Student defined a method for persisting a student instance
public interface StudentDAO {

    // Abstract method for persisting a student object to the database through the DAO
    void save(Student theStudent);

    // Abstract method on DAO interface for finding an object using the object id
    Student findById (int id);

    // Abstract method for returning a list of all the students in the database
    List<Student> findAll();

    // Abstract method for finding a student by last name
    List<Student> findByLastName(String studentLastName);

}
