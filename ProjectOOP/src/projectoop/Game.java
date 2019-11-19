package projectoop;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        //g2d.drawString("hello game", 0,20);
        g2d.setColor(Color.green);
        g2d.fillRect(0, 0, MainClass.WIDTH, MainClass.HEIGHT);
        player.draw(g2d);
        c.draw(g2d);
        g2d.setColor(Color.black);
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
