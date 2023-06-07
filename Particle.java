import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Particle {
    private double x;
    private double y;
    private double velocity;
    Ellipse2D.Double body;

    public Particle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        body = new Ellipse2D.Double(x, y, radius, radius);
    }


//    Renders particle onscreen
    public void draw(Graphics2D g2d) {
        g2d.draw(body);
    }

//    Update position
    public void move() {
        x += 5;
        y += 5;

//        Update actual shape's position
        body.x = x;
        body.y = y;
    }
}
