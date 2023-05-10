import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class BreakoutPanel extends JPanel {

    public static final int PANEL_WIDTH = 800;
    public static final int PANEL_HEIGHT = 600;
    private Image puppyImage;

    private ArrayList<Brick> bricks;
    private Paddle paddle;
    private Ball ball;

    public BreakoutPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        try {
            puppyImage = ImageIO.read(new File("puppy.png"));
        } catch (IOException e) {
            System.out.println("The image did not load");
        }
        bricks = new ArrayList<>();
        for (int row = 0; row < 6; row++) { // we will have 6 rows
            for (int col = 0; col < 8; col++) { // we want 8 columns
                Brick b = new Brick(col * 100, row * 20 + 100, 100, 20);
                bricks.add(b);
            }
        }
        paddle = new Paddle();
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                paddle.x = e.getX();
                repaint();
            }
        });
        ball = new Ball();
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    paddle.x = 350;
                    repaint();
                }
            }
        });
        this.setFocusable(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(new Color(255, 255, 0));
        g.fillRect(0, 0, 800, 600);
        if (puppyImage != null) {
            g.drawImage(puppyImage, 0, 0, 800, 600, null);
        } else {
            // do something else for the background
        }
        for (Brick b : bricks) {
            b.drawSelf(g2d);
        }
        paddle.drawSelf(g2d);
        ball.drawSelf(g2d);
    }

}
