import java.awt.Color;
import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

/**
 * this could also be named app or program
 */
public class Main {

    static Timer timer = new Timer();
    static TimerTask task;

    public static void main(String[] args) {

        /* unit test */
        Head head = new Head(new Point(6, 4), Color.BLACK);

        Snake snake = new Snake(head);
        Body body = new Body(new Point(5, 4), Color.BLUE);

        snake.append(body);

        /* screen */
        JFrame frame = new JFrame();
        Game game = new Game(snake);
        frame.add(game);
        frame.addKeyListener(game);
        frame.pack();
        frame.setVisible(true);

        task = new TimerTask() {

            @Override
            public void run() {
                snake.move();
                game.repaint();
            }
        };
        timer.schedule(task, 100, 100);

    }
}