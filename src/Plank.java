import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Plank extends ImageGameObject {
	//int x = 100;
	//int y = 10;
	
	public Plank(Image image) {
		super(image);
		width = 70;
		height = 20;
		position.x = 130;
		position.y = 480;
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
	}
}
