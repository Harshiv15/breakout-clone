import java.awt.*;

public class Paddle extends Brick {

public static final int PADDLE_WIDTH = 100;
    public Paddle() {
        super(BreakoutPanel.PANEL_WIDTH/2-PADDLE_WIDTH/2, BreakoutPanel.PANEL_HEIGHT-50, 100, 20);
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        g2d.fill(this);
    }
}
