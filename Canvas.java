import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class Canvas extends JPanel {

    Particle p;

    public Canvas() {
        p = new Particle(10, 10, 100);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        draw(g2d);
    }



    //    Updates everything on screen
    public void update() {
        p.move();
    }

    //    Renders everything on screen
    public void draw(Graphics2D g2d) {
        p.draw(g2d);
    }
}

//THis is a new commit
//Fifth (of vodka)