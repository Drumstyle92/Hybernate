package it.develhope.Hybernate.entities;

import jakarta.persistence.*;

/**
 * @author Drumstyle92
 * Class representing the subscription table
 */
@Entity
@Table(name = "enrollments")
public class Enrollments {
    /**
     * primary key variable to initialize the table in mysql
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * variable representing the foreign key of the student table
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
    /**
     * variable representing the foreign key of the school_class table
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_class_id")
    private SchoolClass classes;

    /**
     * @param id Primary key parameter of the class
     * @param student Foreign key parameter of the Student class
     * @param classes Foreign key parameter of the SchoolClass class
     * Constructor of the class to which it belongs
     */
    public Enrollments(Long id, Student student, SchoolClass classes) {
        this.id = id;
        this.student = student;
        this.classes = classes;
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
    public Student getStudent() {
        return student;
    }

    /**
     * @param student
     * Method for encapsulating variables
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return
     * Method for encapsulating variables
     */
    public SchoolClass getClasses() {
        return classes;
    }

    /**
     * @param classes
     * Method for encapsulating variables
     */
    public void setClasses(SchoolClass classes) {
        this.classes = classes;
    }

}
