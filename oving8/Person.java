
package oving8;

import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    // Attributter fornavn, etternavn og fødselsår

    // Constructor
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // Get firstName
    public String getFirstName() {
        return firstName;
    }

    // Get lastName
    public String getLastName() {
        return lastName;
    }

    // Get birthYear
    public int getBirthYear() {
        return birthYear;
    }

    // Set firstName
    public String setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Set lastName
    public String setLastName (String lastName) {
        this.lastName = lastName;
    }

    // Set birthYear
    public int setBirthYear (int birthYear) {
        this.birthYear = birthYear;
    }

    // toString for print
    public String toString() {
        return lastName + ", " + firstName;
    }

}
