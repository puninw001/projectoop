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
public class Phow extends JPanel{
    int px = 120, py = 10;
    Image bg = Toolkit.getDefaultToolkit().createImage(System.getProperty(
          "user.dir")+File.separator+"img"+File.separator+"bhow.png");
    Image th = Toolkit.getDefaultToolkit().createImage(System.getProperty(
          "user.dir")+File.separator+"img"+File.separator+"thow.png");

    public Phow() {
        setSize(640,480);
        setLocation(0,0);
    }
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(bg, 0, 0,640,480,0,0,640,480, this);
        g.drawImage(th, px, py,px+400,py+90,0,0,400,65, this);
        g.setFont(new Font("Angsana New", Font.BOLD, 30));
        g.setColor(Color.yellow);
        g.drawString("กดปุ่มลูกศรขึ้น (^) เพื่อเคลื่อนที่ขึ้น", px+60, py+120);
        g.drawString("กดปุ่มลูกศรลง (v) เพื่อเคลื่อนที่ลง", px+60, py+160);
        g.drawString("กดปุ่มลูกศรซ้าย (<-) เพื่อเคลื่อนไปทางซ้าย", px+40, py+200);
        g.drawString("กดปุ่มลูกศรขวา (->) เพื่อเคลื่อนไปทางขวา", px+40, py+240);
        g.drawString("หากตัวเราชนกับศัตรู จะตัด Score เป็น 0 แต่เล่นต่อได้", px-10, py+280);
        g.drawString("เพราะการลงทัณฑ์มันไม่มีที่สิ้นสุด!", px+60, py+320);
        g.drawString("หากหลบหนีการลงทัณฑ์กลับมาจะหนักกว่าเดิม!", px+10, py+360);
    }
}
