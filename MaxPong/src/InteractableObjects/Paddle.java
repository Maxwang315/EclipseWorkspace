package InteractableObjects;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import interaces.Movable;

public class Paddle extends Drawable implements Movable{

	public Paddle(int x, int y, int speedX, int speedY, int width, int height, double scale) {
		super(x, y, speedX, speedY, width, height, scale);
	}

	@Override
	public void DrawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		
		g2.translate(x, y);
		g2.scale(scale, scale);
		g2.drawRect(-width/2, -height/2, width, height);
		
		g2.setTransform(translate);

	}

	@Override
	public void Move() {
		x += speedX;
		y += speedY;
	}

}
