package exercise2;

public class PartTimeDeveloper extends Developer{
final double salaryPerHour = 35;
private double finalSalary;
    int numberOfHoursWorked;
    @Override
    void calculateSalary() {
        finalSalary = numberOfHoursWorked * salaryPerHour;
    }


    public void setNumberOfHoursWorked(int numberOfHoursWorked){
        this.numberOfHoursWorked = numberOfHoursWorked;

    }

    public int getNumberOfHoursWorked(){
return numberOfHoursWorked;

    }

    @Override
    public String toString() {
        return "PartTimeDeveloper{" +
                "salaryPerHour=" + salaryPerHour +
                ", finalSalary=" + finalSalary +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                '}';
    }


    public double getFinalSalary(){
        return finalSalary;
    }
}
