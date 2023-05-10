import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Brick extends Rectangle2D.Double {
    private Color color;

    public Brick(int x, int y, int w, int h) {
        super(x, y, w, h);
        color = Math.random() < 0.5 ? Color.BLACK : Color.ORANGE;
    }

    public Color getColor() {
        return color;
    }

    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(this);
    }
}
