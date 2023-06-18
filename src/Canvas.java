import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Canvas extends JPanel {

    Node[] particles;
    Particle p;

    public Canvas() {
        p = new Particle(10, 10, 100, new Vector(5, 5));
        particles = new Node[10];
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

//        Section off particles
        for (int i = 0; i < particles.length; i++) {
            Node curr = particles[i];
            while (curr.getNext() != null) {
                int unit = this.getWidth() / particles.length; //Length of each section
                double radius = curr.getNext().getParticle().getRadius(); //Radius of current particle
                double x = curr.getNext().getParticle().getX(); //x position of current particle

                int rightI = (int) (x + radius) / unit; //Right bound index of particle
                int leftI = (int) (x - radius) / unit; //Left bound index of particle

//                Check if right bound of particle is within next section
                if (rightI != i) {

                    curr.remove();
                }

                curr = curr.getNext(); //Move to next node
            }
        }
    }


    //    Renders everything on screen
    public void draw(Graphics2D g2d) {
        p.draw(g2d);

//        Loop through all particles and draw them
        for (Node curr : particles) {
            while (curr != null) {
                curr.getParticle().draw(g2d);
                curr = curr.getNext(); //Move to next node
            }
        }
    }
}