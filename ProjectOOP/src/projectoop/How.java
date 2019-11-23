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
public class How extends JFrame implements ActionListener{
        JButton btn0 = new JButton("Close");

    public How() {
        setSize(640,480);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        btn0.setBounds(250, 320, 150, 50);
        btn0.addActionListener(this);
        add(new Pcredit());
        add(btn0);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btn0)){
           new Menu();
           dispose();
           
       }
    }
}
