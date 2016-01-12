import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Plank extends ImageGameObject {
	public static final int PLANK_WIDTH = 100;
	public static final int PLANK_HEIGHT = 20;
	int speedX = 0;
	//int x = 100;
	//int y = 10;
	
	public Plank(Image image) {
		super(image);
		width = PLANK_WIDTH;
		height = PLANK_HEIGHT;
		position.x = 100;
		position.y = 480;
	}
	
	public void movePlank() {
		if (position.x + speedX > 0 && position.x + speedX < 300-PLANK_WIDTH)
			position.x = position.x + speedX;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(position.x, position.y, PLANK_WIDTH, PLANK_HEIGHT);
	}
	
	public void keyReleased(KeyEvent e) {
		speedX = 0;
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			speedX = -3;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			speedX = 3;
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
	}
}
