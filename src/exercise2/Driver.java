package exercise2;

public class Driver {

    public static void main(String args[]){
FullTimeDeveloper fullTimeDeveloper = new FullTimeDeveloper();
PartTimeDeveloper partTimeDeveloper = new PartTimeDeveloper();

Component component = new Component();

component.messageToAskUser("Choose a developer type enter parttime or fulltime");
String developerType = component.askForInput();


if(developerType.equalsIgnoreCase("parttime")){
    component.messageToAskUser("Please enter number of hours worked");
    String numberOfHoursWorked = component.askForInput();

    partTimeDeveloper.setNumberOfHoursWorked(Integer.parseInt(numberOfHoursWorked));
    partTimeDeveloper.calculateSalary();
    component.showAMessage("The salary for a parttime employee is " + partTimeDeveloper.getFinalSalary() );
}



System.out.println(partTimeDeveloper);
        System.out.println(fullTimeDeveloper);

    }
}
