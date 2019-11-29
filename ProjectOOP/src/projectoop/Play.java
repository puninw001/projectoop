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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.*;
public class Play extends JFrame implements WindowListener {
    private static int chk = 0;
    Game g = new Game();
    public Play() {
        File f = new File("highscore.dat");
        FileOutputStream fout;
        ObjectOutputStream oout;
        FileInputStream fin;
        ObjectInputStream oin;
        try{
            if(f.exists()){
                fin = new FileInputStream("highscore.dat");
                oin = new ObjectInputStream(fin);
                chk = (int) oin.readObject();
                oin.close();
                fin.close();
            }
        }
        catch (ClassNotFoundException ex) {
            System.out.println("err");
        }catch(IOException e){
            System.out.println("err");
        }
        
        setSize(640,480);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
<<<<<<< HEAD
        addWindowListener(this);
        add(g);
=======
        btn.setBounds(10,10, 1, 1);
        btn.addActionListener(this);
        add(new Game());
        //add(btn);
>>>>>>> 90e848c17c6f33a6f5e81500c194319faa22b24e
    }

    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
    }

    @Override
    public void windowClosed(WindowEvent we) {
        File f = new File("highscore.dat");
        FileOutputStream fout;
        ObjectOutputStream oout;
        FileInputStream fin;
        ObjectInputStream oin;
        try{
            fout = new FileOutputStream("highscore.dat");
            oout = new ObjectOutputStream(fout);
            if(Player.hscore >= chk){
                oout.writeObject(Player.hscore);
            }
            oout.close();
            fout.close();
        }
        catch(IOException ex){
            System.out.println("A");
        }
        remove(g);
        new Menu();
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }
    
    
}
