package exercise1;

import javax.swing.*;
import java.util.Scanner;

public class Driver {

    private static Scanner scan = new Scanner(System.in);
    private static Component component;
    private static String typeOfInsurance;
    private static double monthlyFee;

    private static Insurance[] insurances;
public static void main(String args[]) {
    insurances = new Insurance[2];
component = new Component();
    for(int b = 0; b<= 1 ; b+=1) {
        //System.out.println();

        component.messageToAskUser("Please enter the type of insurance (Enter auto or home");
       // typeOfInsurance = scan.nextLine();


typeOfInsurance = component.askForInput();

      //  System.out.println("Please enter the monthly fee");
        component.messageToAskUser("Please enter the monthly fee( Enter numbers only");
        //monthlyFee = Double.parseDouble(scan.nextLine());

monthlyFee = Double.parseDouble(component.askForInput());



        if (typeOfInsurance.equalsIgnoreCase("auto")) {

            Auto auto = new Auto();
            auto.setInsuranceCost(monthlyFee);

            insurances[b] = auto;



        } else if (typeOfInsurance.equalsIgnoreCase("home")) {

            Home home = new Home();
            home.setInsuranceCost(monthlyFee);
            insurances[b] = home;


        }
    }




    for(int i = 0; i<= insurances.length-1; i+=1) {
        insurances[i].displayInfo();

    }

    component.setText(insurances);



}


}
