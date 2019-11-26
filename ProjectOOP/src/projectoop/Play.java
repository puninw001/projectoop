/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

/**
 *
 * @author UBX
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.*;
public class Play extends JFrame implements ActionListener {
    Btn btn = new Btn("Back to Menu");
    public Play() {
        setSize(640,480);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        btn.setBounds(10,10, 1, 1);
        btn.addActionListener(this);
        add(new Game());
        //add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btn)){
           new Menu();
           dispose();
       }
    }
    
    
}
