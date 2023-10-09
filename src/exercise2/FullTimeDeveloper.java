package exercise2;

public class FullTimeDeveloper extends Developer{
    private double finalSalary;
    @Override
    void calculateSalary() {
        finalSalary = 4500;
    }
}
