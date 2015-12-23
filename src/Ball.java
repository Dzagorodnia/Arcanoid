import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

public class Ball extends ImageGameObject {
	private int ballAnge;

	public Ball(Image image) {
		super(image);
		position.x = 130;
		position.y = 420;
	}

	@Override
	public void draw(Graphics g){
		super.draw(g);
	}
	
}
