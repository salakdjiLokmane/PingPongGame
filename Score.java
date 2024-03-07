import java.awt.*;
import javax.swing.*;

public class Score extends Rectangle implements Runnable {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;

        // Start a new thread when the Score object is created
        Thread scoreThread = new Thread(this);
        scoreThread.start();
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
        g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);
        g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);
    }

    @Override
    public void run() {
        while (true) {
            // Perform any continuous scoring logic here
            // For example, update scores or perform other tasks

            // Add a small delay to control the update rate
            try {
                Thread.sleep(100); // Adjust the delay as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
