package exercise3;

public class Mortgage implements MortgageConstants {


    protected int mortgageNumber;

    protected String customerName;
    protected int amountOfMortgage;
    protected double interestRate;
    protected int termDuration;






    public Mortgage(){

    }

    public int getMortgageNumber() {
        return mortgageNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAmountOfMortgage() {
        return amountOfMortgage;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTermDuration() {
        return termDuration;
    }

    public void setMortgageNumber(int mortgageNumber) {
        this.mortgageNumber = mortgageNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAmountOfMortgage(int amountOfMortgage) {
        this.amountOfMortgage = amountOfMortgage;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTermDuration(int termDuration) {

        if(termDuration != SHORT_TERM_MORTGAGE && termDuration != MEDIUM_TERM_MORTGAGE
                && termDuration != LONG_TERM_MORTGAGE){
            termDuration = 1;
        }
        this.termDuration = termDuration;
    }

    public String getMortgageInfo(){


        return "Bank Name: " + BANK_NAME + " Customer Name: " + customerName + " Amount of Mortgage: " + amountOfMortgage + " InterestRate " + interestRate + " Term Duration " + termDuration;
    }


}
