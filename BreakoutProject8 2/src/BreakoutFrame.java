import javax.swing.*;

public class BreakoutFrame extends JFrame {

    public BreakoutFrame(){
        super("My Amazing Breakout Clone");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new BreakoutPanel());
        this.pack();
        this.setVisible(true);
    }

}
