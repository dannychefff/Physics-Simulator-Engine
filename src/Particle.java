import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Particle {
    private double x;
    private double y;
    private double radius;
    private Vector velocity;
    Ellipse2D.Double body;

    public Particle(int x, int y, int r, Vector v) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.velocity = v;
        body = new Ellipse2D.Double(x, y, r, r);
    }




//    Access methods
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }
    public Vector getVelocity() {
        return velocity;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setVelocity(Vector velocity) {
        this.velocity = velocity;
    }




    //    Renders particle onscreen
    public void draw(Graphics2D g2d) {
        g2d.draw(body);
    }

//    Update position
    public void move() {
        x += velocity.getX();
        y += velocity.getY();

//        Update actual shape's position
        body.x = x;
        body.y = y;
    }
}
