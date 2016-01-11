import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class GamePanel extends JPanel {
	int width;
	int height;
	JPanel panel;
	List<GameObject> gameObjects;
	Ball ball = new Ball((ImageLoader.Load("ball.png")));
	Plank plank = new Plank((ImageLoader.Load("Plank.png")));

	public GamePanel(int width, int height) {
		super();
		// setBorder(BorderFactory.createLineBorder(Color.black));
		this.width = width;
		this.height = height;
		this.gameObjects = new ArrayList<GameObject>();
		gameObjects.add(ball);
		gameObjects.add(plank);
		GenarateLv1();
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				plank.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				plank.keyPressed(e);
			}
		});
		setFocusable(true);

	}

	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	public void GenarateLv1() {
		Point position = new Point(0, 0);
		for (position.x = 0; position.x < 300 - 30; position.x = position.x + 40) {
			for (position.y = 0; position.y < 60; position.y = position.y + 30) {
				// position.y = 0;
				Brick brick1 = new Brick(ImageLoader.Load("brick.png"));
				brick1.position.x = position.x;
				brick1.position.y = position.y;
				gameObjects.add(brick1);
			}
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.LIGHT_GRAY); // select color
		g.fillRect(0, 0, width, height);
		for (GameObject element : gameObjects) {
			element.draw(g);
		}
	}

	public void Update(long animationTimeStep) {
		// TODO Auto-generated method stub

	}
}
