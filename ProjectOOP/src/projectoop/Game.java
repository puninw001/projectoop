

package projectoop;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Game extends JPanel implements ActionListener{
    Timer loop;
    Player player;
    public static int score = 0;
    ControlEnemy c;
    public Game() {
        loop = new Timer(10, this);
        loop.start();
        player = new Player(300, 200);
        c = new ControlEnemy();
        addKeyListener(new KeyInput(player));
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Image img;
        Graphics2D g2d = (Graphics2D)g;
        try {
            img = ImageIO.read(new File("img/gb.gif"));
            g2d.drawImage(img, 0, 0,640,480,0,0,640,480, this);
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            player.draw(g2d);
            c.draw(g2d);
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        g2d.setColor(Color.white);
        g2d.setFont(new Font("Tahoma",Font.BOLD,20));
        g2d.drawString("Score : "+score,0,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        c.update();
        score++;
        repaint();
    }
}
