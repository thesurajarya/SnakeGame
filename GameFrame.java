import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake Game 🐍");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // fits window to preferred size
        this.setVisible(true);
        this.setLocationRelativeTo(null); // center on screen
    }
}
