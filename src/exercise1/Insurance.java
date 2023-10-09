package exercise1;

public abstract class Insurance {

    String typeOfInsurance;
    double monthlyCostOfInsurance;


    public String getTypeOfInsurance() {
        return this.toString() ;
    }

    public double getMonthlyCostOfInsurance() {
        return monthlyCostOfInsurance;
    }

    abstract void setInsuranceCost(double monthlyCostOfInsurance);

    abstract void displayInfo();
}
