package exercise1;

public class Home extends Insurance{


    @Override
    void setInsuranceCost(double monthlyCostOfInsurance) {
        this.monthlyCostOfInsurance = monthlyCostOfInsurance;
    }

    @Override
    void displayInfo() {
        System.out.println(" The monthly cost of home insurance is " + monthlyCostOfInsurance);
    }

    @Override
    public String toString() {
        return "home";
    }



}
