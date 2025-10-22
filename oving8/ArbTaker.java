
package oving8;

import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArbTaker extends Person {

    // datatype Person
    // int arbTakerNr;
    // int yearJoined;
    private double monthlySalary;
    // double taxPercentage;

    // Attributter personalia (datatype Person), arbtakernr
    // ansettelsesår, månedslønn og skatteprosent.

    // Constructor
    public ArbTaker(String firstName, String lastName, double monthlySalary) {
        super(firstName, lastName);
        // this.yearJoined = yearJoined;
        this.monthlySalary = monthlySalary;
        // this.taxPercentage = taxPercentage;
    }

    // Get yearJoined
    /* public int getYearJoined() {
        return yearJoined;
    }*/

    // Get monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Get taxPercentage
    /* public double getTaxPercentage() {
        return taxPercentage;
    } */

    // Get taxKroner
    /* public double getTaxKroner() {
        return (taxPercentage * monthlySalary);
    } */

    // Set monthlySalary
    public double setMonthlySalary() {
        this.monthlySalary = monthlySalary;
    }

    // Set taxPercentage
    /* public double setTaxPercentage() {
        double taxPercentage = setTaxPercentage();
        return taxPercentage;
    } */
}
