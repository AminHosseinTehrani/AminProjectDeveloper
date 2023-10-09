package exercise3;


import javax.swing.*;


public class Component {

    private final JPanel panel;

    private final JFrame frame;

    private JLabel mortgageOne;

    private JLabel mortgageTwo;

    private JLabel mortgageThree;


private String messageToAskUser;
    public Component(){
        frame = new JFrame();
        panel = new JPanel();


        frame.setTitle("Gui");


        frame.setSize(600,600);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);





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


    public void showAMessage(String message){

        JOptionPane.showMessageDialog(frame,message);

    }








}