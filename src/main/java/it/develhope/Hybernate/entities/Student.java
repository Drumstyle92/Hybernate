package it.develhope.Hybernate.entities;

import jakarta.persistence.*;
import java.util.List;

/**
 * @author Drumstyle92
 * Class representing the student table
 */
@Entity
@Table(name = "students")
public class Student {
    /**
     * primary key variable to initialize the table in mysql
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Student last name variable and column
     */
    @Column(nullable = false, name = "last_name")
    private String lastName;
    /**
     * Student name variable and column
     */
    @Column(nullable = false, name = "first_name" )
    private String firstName;
    /**
     * Student email variable and column
     */
    @Column(nullable = false, unique = true)
    private String email;
    /**
     * variable that represents the student and the enrollments with a relationship of 1 to N
     */
    @OneToMany(mappedBy = "student")
    private List<Enrollments> enrollments;

    /**
     * @param id Primary key parameter of each student
     * @param lastName Student last name parameter
     * @param firstName Student first name parameter
     * @param email Student email parameter
     * @param enrollments Student enrollment parameter
     * Constructor of the class to which it belongs
     */
    public Student(Long id, String lastName, String firstName, String email, List<Enrollments> enrollments) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.enrollments = enrollments;
    }

    /**
     * @return
     * Method for encapsulating variables
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     * Method for encapsulating variables
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return
     * Method for encapsulating variables
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     * Method for encapsulating variables
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     * Method for encapsulating variables
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     * Method for encapsulating variables
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     * Method for encapsulating variables
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     * Method for encapsulating variables
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     * Method for encapsulating variables
     */
    public List<Enrollments> getEnrollments() {
        return enrollments;
    }

    /**
     * @param enrollments
     * Method for encapsulating variables
     */
    public void setEnrollments(List<Enrollments> enrollments) {
        this.enrollments = enrollments;
    }

}
