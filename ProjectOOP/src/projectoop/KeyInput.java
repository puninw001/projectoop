package projectoop;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
    Player p;
    
    public KeyInput(Player p) {
        this.p = p;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        p.keyPressed(e);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        p.keyReleased(e);
    }
}
