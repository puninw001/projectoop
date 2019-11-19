package projectoop;
import javax.swing.*;
public class MainClass {

    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    public static void main(String[] args) {
        JFrame window = new JFrame("2D Game");
        window.setSize(WIDTH,HEIGHT);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(new Game());
        window.setVisible(true);
    }
    
}
