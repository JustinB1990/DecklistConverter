package com.company;
import javax.swing.*;
import java.awt.*;

public class IntroWindow extends JFrame {

    public String deckList = "Magic: the Gathering Decklist Converter\n Submit a decklist to receive HTML code for your website.";

    public IntroWindow(){
        //Using TextArea for this window so that anything in it is Copy/Pastable.
        TextArea textArea = new TextArea(deckList);
        textArea.setEditable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocation(400, 400);
        JPanel main = new JPanel(new BorderLayout());
        main.add(textArea, BorderLayout.CENTER);

        JButton mainButton = new JButton("Enter New Deck");
        mainButton.addActionListener(e -> {
            deckList = new DecklistInputWindow().showDecklistInput("Please Enter Your Decklist:");

            //Insert Danny's Call method using deckList as the parameter to receive the updated
            //String containing HTML Code and overwrite deckList as that String.

            textArea.setText("HTML CODE:\n" + deckList);
        });
        main.add(mainButton, BorderLayout.SOUTH);
        getContentPane().add(main);
    }
}