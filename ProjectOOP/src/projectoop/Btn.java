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
import java.io.FileInputStream;
import javax.swing.*;
import javax.swing.border.*;
public class Btn extends JButton{

    public Btn() {
        this("");
    }
    

    public Btn(String s) {
        super(s);
        setBackground ( Color.BLACK );
        setForeground ( Color.WHITE );
        setBorder( BorderFactory.createLineBorder ( Color.RED, 2 ) );
        setFont (new Font("Angsana New", Font.BOLD, 20));
    }
    
}
