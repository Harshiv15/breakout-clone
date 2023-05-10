import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball extends Ellipse2D.Double {

    public Ball() {
        super(BreakoutPanel.PANEL_WIDTH/2.0, 250, 20, 20);
    }

    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(Color.GREEN);
        g2d.fill(this);
    }
}
