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
public class Pcredit extends JPanel{
    Image bg = Toolkit.getDefaultToolkit().createImage(System.getProperty(
          "user.dir")+File.separator+"img"+File.separator+"bg.jpg");

    public Pcredit() {
        setSize(640,480);
        setLocation(0,0);
    }
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(bg, 0, 0,640,480,0,0,678,452, this);
    }
}
