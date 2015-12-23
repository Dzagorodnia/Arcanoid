import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Brick extends ImageGameObject {
	
	public Brick(Image image) {
		super(image);
		position.x = 0;
		position.y = 0;
		width = 30;
		height = 20;
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
	}
}
