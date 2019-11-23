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
public class Menu extends JFrame implements ActionListener{
    JButton btn1 = new JButton("Start");
    JButton btn2 = new JButton("How to play?");
    JButton btn3 = new JButton("Credits");
    int Ly = 160;
    public Menu() {
        setSize(640,480);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        btn1.setBounds(250, Ly, 150, 50);
        btn2.setBounds(250, Ly+80, 150, 50);
        btn3.setBounds(250, Ly+160, 150, 50);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(new Pmenu());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource().equals(btn1)){
           new Play();
           dispose();
       }
       else if(ae.getSource().equals(btn2)){
           new How();
           dispose();
       }
       else if(ae.getSource().equals(btn3)){
           new Credit();
           dispose();
       }
    }
    
}
