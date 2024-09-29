package InteractableObjects;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import interaces.*;

public class Ball extends Drawable implements Movable{
	
	public Ball(double x, double y, double speedX, double speedY, int width, int height, double scale) {
		super(x, y, speedX, speedY, width, height, scale);
	}
	
	@Override
	public void Move() {
		x += speedX;
		y += speedY;
	}

	@Override
	public void DrawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		
		g2.translate(x, y);
		g2.scale(scale, scale);
		g2.drawOval(-width/2, -height/2, width, height);
		
		
		g2.setTransform(translate);
	}
}
