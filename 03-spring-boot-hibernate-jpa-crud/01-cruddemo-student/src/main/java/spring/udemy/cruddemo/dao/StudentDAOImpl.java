package spring.udemy.cruddemo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.udemy.cruddemo.entity.Student;
import spring.udemy.cruddemo.entity.professor;

import java.util.List;

// This DAO class for student is annotated with @Resposity, which identifies it to spring as a @Component and @Bean to be managed
// @Repository annotation supports component scanning and translates JDBC exceptions
@Repository
public class StudentDAOImpl implements StudentDAO{


    // define field for entity manager
    private EntityManager entityManager;


    //inject entity manager using constructor injection
    // @Autowired annotation identifies that this constructor is used for constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // implement save method
    // @Transactional (spring framework) is used to open a proxy for handling CRUD operations to ensure completion of transactions and validity of data
    // When @Transactional methods are called, the spring container opens a transaction that ensures the completion of an operation, or reverted the database back if incomplete
    // A proxy wrapped around the @Repository and intercepts the method calls to the database
    @Override
    @Transactional
    public void save(Student theStudent) {
        System.out.println("ENTITY MANAGER PERSISTED STUDENT");
        entityManager.persist(theStudent);
    }

    // Implementation of the retrieval method of the DAO interface
    // @Transactional annotation not required because method is read only
    @Override
    public Student findById(int id) {
        // Find method of EntityManager, a helper class native to spring, takes the class of the entity to retrieve and the id of the object
        return entityManager.find(Student.class, id);
    }

    // Implements the abstract method on the DAO interface for the student entity
    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);
        return query.getResultList();
    }


    @Override
    public List<Student> findByLastName(String studentLastName) {
        // Typed query is a JPA class representing a query with a known return type
        // JPQL used, main difference is entity field names used, regardless of table and column names
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE lastName=:student", Student.class);
        // Setting the named parameter for the query
        query.setParameter("student", studentLastName);
        // Retrieving the results for the query
        return query.getResultList();
    }

    @Transactional
    @Override
    public void update(Student student) {
        // Performs an update on the student entity passed to the merge method
        // Merges based on the entity ID
        entityManager.merge(student);
    }
}
