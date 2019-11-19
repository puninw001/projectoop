package projectoop;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player {
    private int x, y, speedx =0, speedy=0;
    private LinkedList<Enemy> e = ControlEnemy.getEnemyBounds();
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void update(){
        x += speedx;
        y += speedy;
        
        if (x<0){
            x=0;
        }
        if (y<0){
            y=0;
        }
        if (x>605){
            x=605;
        }
        if (y>420){
            y=420;
        }
        colision();
    }
    
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.red);
        g2d.fillRect(x,y,32,32);
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            speedx = 5;
        }
        if(key == KeyEvent.VK_LEFT){
            speedx = -5;
        }
        if(key == KeyEvent.VK_UP){
            speedy = -5;
        }
        if(key == KeyEvent.VK_DOWN){
            speedy = 5;
        }
    }
    
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            speedx = 0;
        }
        if(key == KeyEvent.VK_LEFT){
            speedx = 0;
        }
        if(key == KeyEvent.VK_UP){
            speedy = 0;
        }
        if(key == KeyEvent.VK_DOWN){
            speedy = 0;
        }
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y, 32,32);
    }

    public void colision(){
        for (int i = 0; i< e.size(); i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                System.out.println("Your Score is "+Game.score);
                Game.score = 0;
            }
        }
    }

}
