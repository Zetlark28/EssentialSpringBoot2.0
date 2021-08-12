package it.ezpeleta.lil.roomwebapp.models;

//model : entity or dto to pass to FE
public class Staff {

    private long id;
    private String firstName;
    private String lastName;
    private StaffPosition position;

    public Staff() {
    }

    public Staff(long id, String firstName, String lastName, StaffPosition position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void setId(long id) {
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

    public long getId() {
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
