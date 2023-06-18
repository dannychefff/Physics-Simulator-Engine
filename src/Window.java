import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    static int width = 1000;
    static int height = 1000;

    Timer timer;
    Canvas canvas;

    public Window () {
//        Initialize frame
        setSize(new Dimension(width, height));
        setVisible(true);
        setResizable(false);

//        Setup canvas
        canvas = new Canvas();
        add(canvas);

//        Setup timer
        timer = new Timer(20, this);
        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        canvas.update();
        repaint(); //Clear/reset frame
    }
}
