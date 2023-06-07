public class Vector {
    private double x;
    private double y;
    private double angle;
    private double mag;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        updateDirection();
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAngle() {
        return angle;
    }

    public double setMag() {
        return mag;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setMag(double mag) {
        this.mag = mag;
    }




//    Update position coordinates of vector
    public void updatePosition () {
        x = mag*Math.sin(angle);
        y = mag*Math.cos(angle);
    }


//    Update polar coordinates of vector
    public void updateDirection() {
        angle = Math.atan2(x, y);
        mag = Math.sqrt(x*x + y*y);
    }


//    Vector addition
    public void add(Vector v) {
        x += v.x;
        y += v.y;
    }
}
