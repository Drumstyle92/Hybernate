package it.develhope.Hybernate.entities;

import jakarta.persistence.*;
import java.util.List;

/**
 * @author Drumstyle92
 * Class representing the various schools
 */
@Entity
@Table(name = "school_classes" )
public class SchoolClass {
    /**
     * primary key variable to initialize the table in mysql
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * variable of the name of the schools represented on the column of the table
     */
    @Column(nullable = false, name = "title")
    private String title;
    /**
     * school description variable with reference column
     */
    @Column(nullable = false, name = "description")
    private String description;
    /**
     * list that links the school_class table with the Enrollments table with a 1 to N relationship
     */
    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;

    /**
     * @param id Autoincrementing primary key parameter
     * @param title School name parameter
     * @param description School description parameter
     * @param enrollments School enrollment parameter
     * Constructor of the class to which it belongs
     */
    public SchoolClass(Long id, String title, String description, List<Enrollments> enrollments) {
        this.id = id;
        this.title = title;
        this.description = description;
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
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     * Method for encapsulating variables
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return
     * Method for encapsulating variables
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     * Method for encapsulating variables
     */
    public void setDescription(String description) {
        this.description = description;
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
