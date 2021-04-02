import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {


    public GameBoard() {


        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for (int col = 0; col < 12; col++) {
            for (int row = 0; row < 12; row++) {

                GameTile tile = new GameTile(row * 50, col * 50+40);
                tile.render(g);

            }
        }
    }
}