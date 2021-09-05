package it.ezpeleta.lil.roomwebapp.models;

import javax.persistence.*;

//model : entity or dto to pass to FE
@Entity
@Table(name = "EMPLOYEE")
public class Staff {

    @Id
    @Column(name = "EMPLOYEE_ID")
    private String id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    private StaffPosition position;

    public Staff() {
    }

    public Staff(String id, String firstName, String lastName, StaffPosition position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(StaffPosition position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public StaffPosition getPosition() {
        return position;
    }
}
