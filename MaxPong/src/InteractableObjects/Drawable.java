package InteractableObjects;
import java.awt.*;

public abstract class Drawable {
	protected double x = -500;
	protected double y = -500;
	protected double speedX = 0;
	protected double speedY = 0;
	protected int width;
	protected int height;
	protected double scale;
	
	public Drawable(double x, double y, double speedX, double speedY, int width, int height, double scale) {
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.width = width;
		this.height = height;
		this.scale = scale;
	}
	
	public abstract void DrawMe(Graphics2D g2);
	
	public double GetX() {
		return x;
	}
	
	public double GetY() {
		return y;
	}
	
	public int GetWidth() {
		return width;
	}
	
	public int GetHeight() {
		return height;
	}
	
	public void ReverseY() {
		speedY *= -1;
	}
	
	public void ReverseX() {
		speedX *= -1;
	}
	
	public void SetSpeedX(double speedX) {
		this.speedX = speedX;
	}
	
	public void SetSpeedY(double speedY) {
		this.speedY = speedY;
	}
	
	public double GetSpeedX() {
		return speedX;
	}
	
	public double GetSpeedY() {
		return speedY;
	}
	
	public void SetX(int x) {
		this.x = x;
	}
	
	public void SetY(int y) {
		this.y = y;
	}
}
