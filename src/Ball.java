import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

public class Ball extends ImageGameObject {
	private int ballAnge;
	public static final int BALL_WIDTH = 30;
	public static final int BALL_HEIGHT = 30;
	int xSpeed = 1;
	int ySpeed = 1;

	public Ball(Image image) {
		super(image);
		width = BALL_WIDTH;
		height = BALL_HEIGHT;
		position.x = 130;
		position.y = 420;
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
	}

	public void moveBall() {
		if (position.x + xSpeed < 0)
			xSpeed = 1;
		if (position.x + xSpeed > 300 - BALL_WIDTH)
			xSpeed = -1;
		if (position.y + ySpeed < 0)
			ySpeed = 1;
		if (position.y + ySpeed > 500 - BALL_HEIGHT)
			ySpeed = -1;
		position.x = position.x + xSpeed;
		position.y = position.y + ySpeed;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(position.x, position.y, BALL_WIDTH, BALL_HEIGHT);
	}

}
