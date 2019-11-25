package projectoop;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Enemy {
    private int x, y, speedx=5, speedy=5;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        
    }
    
    public void draw(Graphics2D g2d) throws IOException{
        Image cursor = ImageIO.read(new File("img/tes.gif"));
        g2d.drawImage(cursor, x, y, 32, 32, null);
    }
    public void update(){
        x+=speedx;
        y+=speedy;
        if (x<-100){
            speedx=5;
        }
        if (y<-100){
            speedy=5;
        }
        if (x>740){
            speedx=-5;
        }
        if (y>580){
            speedy=-5;
        }
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y, 32,32);
    }
}
