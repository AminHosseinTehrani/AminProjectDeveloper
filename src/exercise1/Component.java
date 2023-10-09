package exercise1;


import javax.swing.*;


public class Component {

    private JPanel panel;

    private JFrame frame;

    private JLabel mainTextOne;
    private JLabel subTextOne;

    private JLabel mainTextTwo;
    private JLabel subTextTwo;
    private JLabel[][] textFields;



private String messageToAskUser;
    public Component(){
        frame = new JFrame();
        panel = new JPanel();
        mainTextOne = new JLabel();
        subTextOne = new JLabel();

        mainTextTwo = new JLabel();
        subTextTwo = new JLabel();
        textFields = new JLabel[][]{{mainTextOne, subTextOne}, {mainTextTwo, subTextTwo}};


        frame.setSize(600,600);
        frame.setTitle("Gui");

        panel.add(mainTextOne);
        panel.add(subTextOne);

        panel.add(mainTextTwo);
        panel.add(subTextTwo);


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);





    }

    public void setText(Insurance[] array){
for(int i = 0; i<= array.length-1; i+=1){

    textFields[i][0].setText(array[i].getTypeOfInsurance());
    textFields[i][1].setText(Double.toString(array[i].getMonthlyCostOfInsurance()));

}

}




    public void messageToAskUser(String messageToAsk ){


this.messageToAskUser = messageToAsk;

    }

    public String getMessageToAskUser(){
        return messageToAskUser;
    }




    public String askForInput(){
     String input;
          input =  JOptionPane.showInputDialog(getMessageToAskUser());

return input;
    }








}