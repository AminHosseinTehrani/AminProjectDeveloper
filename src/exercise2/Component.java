package exercise2;


import exercise1.Insurance;

import javax.swing.*;


public class Component {

    private JPanel panel;

    private JFrame frame;




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