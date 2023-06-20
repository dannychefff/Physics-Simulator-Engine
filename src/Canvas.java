import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Canvas extends JPanel {
    Node particles;
    int width, height;

    public Canvas() {
        particles = new Node();
        width = 1000;
        height = 1000;

//        Test code
        particles.add(new Node(null, new Particle(100, 100, 100, new Vector(10, 0))));
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        draw(g2d);
    }



    //    Updates everything on screen
    public void update() {
//        Section off particles
        Node curr = particles;
        while (curr.getNext() != null) {
            curr.getNext().getParticle().move(); //Move all particles
            curr = curr.getNext(); //Move to next node
        }
    }


    //    Renders everything on screen
    public void draw(Graphics2D g2d) {
//        Loop through all particles and draw them
        Node curr = particles; //Get the current node
        while (curr.getNext() != null) {
            curr.getNext().getParticle().draw(g2d);
            curr = curr.getNext(); //Move to next node
        }
    }
}