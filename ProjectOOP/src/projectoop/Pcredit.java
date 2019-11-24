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
    int px = 120, py = 50;
    Image cr = Toolkit.getDefaultToolkit().createImage(System.getProperty(
          "user.dir")+File.separator+"img"+File.separator+"credit.jpg");
    Image tcr = Toolkit.getDefaultToolkit().createImage(System.getProperty(
          "user.dir")+File.separator+"img"+File.separator+"tcr.png");

    public Pcredit() {
        setSize(640,480);
        setLocation(0,0);
    }
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(cr, 0, 0,640,480,0,0,640,420, this);
        g.drawImage(tcr, px, py,px+400,py+70,0,0,400,65, this);
        g.setFont(new Font("Angsana New", Font.BOLD, 30));
        g.setColor(Color.red);
        g.drawString("1. นายนรวิชญ์ มานะพัฒนานุกุล รหัสนักศึกษา 61070098", px-20+1, py+120-1);
        g.drawString("1. นายนรวิชญ์ มานะพัฒนานุกุล รหัสนักศึกษา 61070098", px-20+1, py+120+1);
        g.drawString("1. นายนรวิชญ์ มานะพัฒนานุกุล รหัสนักศึกษา 61070098", px-20-1, py+120+1);
        g.drawString("1. นายนรวิชญ์ มานะพัฒนานุกุล รหัสนักศึกษา 61070098", px-20-1, py+120-1);
        g.setColor(Color.white);
        g.drawString("1. นายนรวิชญ์ มานะพัฒนานุกุล รหัสนักศึกษา 61070098", px-20, py+120);
        
        g.setColor(Color.red);
        g.drawString("2. นายพัชร์ชวิชญ์ หมื่นสุนทร รหัสนักศึกษา 610700134", px-20+1, py+160-1);
        g.drawString("2. นายพัชร์ชวิชญ์ หมื่นสุนทร รหัสนักศึกษา 610700134", px-20+1, py+160+1);
        g.drawString("2. นายพัชร์ชวิชญ์ หมื่นสุนทร รหัสนักศึกษา 610700134", px-20-1, py+160+1);
        g.drawString("2. นายพัชร์ชวิชญ์ หมื่นสุนทร รหัสนักศึกษา 610700134", px-20-1, py+160-1);
        g.setColor(Color.white);
        g.drawString("2. นายพัชร์ชวิชญ์ หมื่นสุนทร รหัสนักศึกษา 610700134", px-20, py+160);
        
        g.setColor(Color.red);
        g.drawString("3. นายภานุวัฒน์ ศรีจันทร์วิจิตร์ รหัสนักศึกษา 610700160", px-20+1, py+200-1);
        g.drawString("3. นายภานุวัฒน์ ศรีจันทร์วิจิตร์ รหัสนักศึกษา 610700160", px-20+1, py+200+1);
        g.drawString("3. นายภานุวัฒน์ ศรีจันทร์วิจิตร์ รหัสนักศึกษา 610700160", px-20-1, py+200+1);
        g.drawString("3. นายภานุวัฒน์ ศรีจันทร์วิจิตร์ รหัสนักศึกษา 610700160", px-20-1, py+200-1);
        g.setColor(Color.white);
        g.drawString("3. นายภานุวัฒน์ ศรีจันทร์วิจิตร์ รหัสนักศึกษา 610700160", px-20, py+200);
        
        g.setColor(Color.red);
        g.drawString("4. นายรัญชน์พล ทองวัฒนานนท์ รหัสนักศึกษา 610700183", px-20+1, py+240-1);
        g.drawString("4. นายรัญชน์พล ทองวัฒนานนท์ รหัสนักศึกษา 610700183", px-20+1, py+240+1);
        g.drawString("4. นายรัญชน์พล ทองวัฒนานนท์ รหัสนักศึกษา 610700183", px-20-1, py+240+1);
        g.drawString("4. นายรัญชน์พล ทองวัฒนานนท์ รหัสนักศึกษา 610700183", px-20-1, py+240-1);
        g.setColor(Color.white);
        g.drawString("4. นายรัญชน์พล ทองวัฒนานนท์ รหัสนักศึกษา 610700183", px-20, py+240);
        
        g.setColor(Color.red);
        g.drawString("5. นายสิรภพ รักเกื้อ รหัสนักศึกษา 610700241", px-20+1, py+280-1);
        g.drawString("5. นายสิรภพ รักเกื้อ รหัสนักศึกษา 610700241", px-20+1, py+280+1);
        g.drawString("5. นายสิรภพ รักเกื้อ รหัสนักศึกษา 610700241", px-20-1, py+280+1);
        g.drawString("5. นายสิรภพ รักเกื้อ รหัสนักศึกษา 610700241", px-20-1, py+280-1);
        g.setColor(Color.white);
        g.drawString("5. นายสิรภพ รักเกื้อ รหัสนักศึกษา 610700241", px-20, py+280);
    }
}
