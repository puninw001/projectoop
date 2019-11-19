package projectoop;

import java.awt.Graphics2D;
import java.util.LinkedList;

public class ControlEnemy {
    static LinkedList<Enemy> e = new LinkedList<>();
    Enemy temp;
    
    public ControlEnemy(){
        addEnemy(new Enemy(150, 150));
        addEnemy(new Enemy(200, 500));
        addEnemy(new Enemy(400, 100));
        addEnemy(new Enemy(600, 600));
        addEnemy(new Enemy(500, 300));
    }
    public void draw(Graphics2D g2d){
        for (int i=0; i< e.size(); i++){
            temp=e.get(i);
            temp.draw(g2d);
        }
    }
    public void update(){
        for (int i=0; i<e.size();i++){
            temp=e.get(i);
            temp.update();
        }
    }
    
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}
