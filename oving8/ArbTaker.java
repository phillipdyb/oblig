
package oving8;

import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArbTaker {

    int yearJoined = yearJoined;
    double monthlySalary = monthlySalary;
    double taxPercentage = taxPercentage;

    // Attributter personalia (datatype Person), arbtakernr
    // ansettelsesår, månedslønn og skatteprosent.

    // Constructor
    public ArbTaker(int yearJoined, double monthlySalary, double taxPercentage) {
        this.yearJoined = yearJoined;
        this.monthlySalary = monthlySalary;
        this.taxPercentage = taxPercentage;
    }

    // Get yearJoined
    public int getYearJoined() {
        return yearJoined;
    }

    // Get monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Get taxPercentage
    public double getTaxPercentage() {
        return taxPercentage;
    }

    // Get taxKroner
    public double getTaxKroner() {
        int taxKroner = (taxPercentage * monthlySalary);
        return taxKroner;
    }

    // Set monthlySalary
    public double setMonthlySalary() {
        double monthlySalary = setMonthlySalary();
        return monthlySalary;
    }

    // Set taxPercentage
    public double setTaxPercentage() {
        double taxPercentage = setTaxPercentage();
        return taxPercentage;
    }
}
