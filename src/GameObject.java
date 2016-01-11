import java.awt.*;

public abstract class GameObject {
	public Point position = new Point(0, 0); // base point for our object
	protected int height = 0; // object height
	protected int width = 0; // object width
	
	public int getWidth() { // get pictures width
		return width;
	}

	public int getHeight() { // get pictures height
		return height;
	}

	abstract public void draw(Graphics g);
	
}

