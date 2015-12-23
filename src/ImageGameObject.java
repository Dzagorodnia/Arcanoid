import java.awt.*;

public class ImageGameObject extends GameObject {
	protected Image image;
	
	public ImageGameObject(Image image){
		this.image = image;
	}
	@Override
	public void draw(Graphics g){
		g.drawImage(image,position.x,position.y,width,height,null);
	}
	
}
