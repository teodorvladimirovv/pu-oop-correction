import java.awt.*;

public class GameTile {

    private int row;
    private int col;

    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
    }

    public void render(Graphics g) {

        for (int c = 1; c <= 12; c++) {
            for (int r = 1; r <= 12; r++) {
                g.setColor(Color.GRAY);
            }
            g.drawRect(row, col, 50, 50);
            g.fillRect(row, col, 50 - 1, 50 - 1);

        }
    }
}