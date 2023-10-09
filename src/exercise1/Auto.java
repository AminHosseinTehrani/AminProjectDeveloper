package exercise1;

import javax.swing.*;

public class Auto extends Insurance{
    @Override
    void setInsuranceCost(double monthlyCostOfInsurance) {
        this.monthlyCostOfInsurance = monthlyCostOfInsurance;
    }

    @Override
    void displayInfo() {
        System.out.println(" The monthly cost of auto insurance is " + monthlyCostOfInsurance);


    }

    @Override
    public String toString() {
        return "auto";
    }
}
