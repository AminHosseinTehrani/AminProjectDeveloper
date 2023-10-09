package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
private static double currentInterestRate;
private static Component component;
private static Mortgage[] mortgages;


    public static void main(String args[]){
        component = new Component();
        mortgages = new Mortgage[3];
        String allMortgages = "";
        Scanner scan = new Scanner(System.in);


        //System.out.println("Enter current interest rate");
        //currentInterestRate = scan.nextDouble();
        component.messageToAskUser("Enter current interest rate");
        currentInterestRate = Double.parseDouble(component.askForInput());
        for(int i = 0; i<= 2; i+=1){
            //System.out.println("Please enter new mortgage info");
            component.showAMessage("Please enter new mortgage info");


            //System.out.println("-----------------------------");

            //System.out.println("Enter mortgage Type");
            component.messageToAskUser("Enter mortgage Type, enter personal or business");

            //String mortgageType = scan.next();
            String mortgageType = component.askForInput();


            //System.out.println("Enter mortgage Number");
            component.messageToAskUser("Enter mortgage Number");

            //int mortgageNumber = scan.nextInt();
            int mortgageNumber = Integer.parseInt(component.askForInput());


            //System.out.println("Enter customer Name");
            component.messageToAskUser("Enter customer Name");


           // String customerName = scan.next();
            String customerName = component.askForInput();


            //System.out.println("Enter amount of Mortgage");
            component.messageToAskUser("Enter amount of Mortgage");

            //int amountOfMortgage = scan.nextInt();
            int amountOfMortgage = Integer.parseInt(component.askForInput());

            while(amountOfMortgage > MortgageConstants.MAXIMUM_MORTGAGE_AMOUNT){
                //System.out.println("Please enter amount less than or equal to 500000");
                component.showAMessage("Please enter amount less than or equal to 500000");
                amountOfMortgage = Integer.parseInt(component.askForInput());
            }


            //System.out.println("Enter term duration");
            component.messageToAskUser("Enter term duration");

            //int termDuration = scan.nextInt();
            int termDuration = Integer.parseInt(component.askForInput());



            if(mortgageType.equalsIgnoreCase("personal")){
                PersonalMortgage personalMortgage = new PersonalMortgage();
                personalMortgage.setMortgageNumber(mortgageNumber);
                personalMortgage.setCustomerName(customerName);
                personalMortgage.setAmountOfMortgage(amountOfMortgage);
                personalMortgage.setInterestRate(currentInterestRate);
                personalMortgage.setTermDuration(termDuration);

                mortgages[i] = personalMortgage;


            }

            else if( mortgageType.equalsIgnoreCase("business")){
                BusinessMortgage businessMortgage = new BusinessMortgage();
                businessMortgage.setMortgageNumber(mortgageNumber);
                businessMortgage.setCustomerName(customerName);
                businessMortgage.setAmountOfMortgage(amountOfMortgage);
                businessMortgage.setInterestRate(currentInterestRate);
                businessMortgage.setTermDuration(termDuration);

                mortgages[i] = businessMortgage;

            }

       }

        for(int i = 0; i<= mortgages.length -1; i+=1) {
            System.out.println(mortgages[i].getMortgageInfo());
        allMortgages += mortgages[i].getMortgageInfo() + "\n";

        }

        component.showAMessage(allMortgages);
    }
}

