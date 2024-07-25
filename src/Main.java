//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = createWindow();
        GamePanel gp = new GamePanel();
        f.add(gp);

    }

    public static JFrame createWindow()
    {
        //creates and returns JFrame
        JFrame w = new JFrame("Window Name");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setTitle("RTS Magic");
        w.setSize(1600,1000);
        w.setResizable(false);
        w.setLayout(null);
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        return w;
    }
}