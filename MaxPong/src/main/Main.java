package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import InteractableObjects.*;
import interaces.*;
import main.Main.MyKeyListener;
import main.Main.MyMouseListener;
import main.Main.MyMouseMotionListener;


public class Main extends JPanel implements ActionListener {
	private int screenWidth = 640;
	private int screenHeight = 480;
	private Drawable drawable;
	private Paddle paddle;
	private Ball ball;
	private int paddleSpeedX = 3;
	private boolean leftKeyPressed = false;
	private boolean rightKeyPressed = false;
	
	ArrayList<Object> movableDrawableElements = new ArrayList<Object>();

	public Main(JFrame frame) {
		super();
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
		
		paddle = new Paddle(320, 450, 0, 0, 100, 25, 1);
		ball = new Ball(200, 200, 0.5, 1.0, 25, 25, 1);
		movableDrawableElements.add(ball);
		movableDrawableElements.add(paddle);
		
		// Key Adaptor
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
		// Mouse Adaptor
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());
		
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		for(Object o : movableDrawableElements) {
			((Drawable)o).DrawMe(g2);
		}
		
		GamePlay();
		
		super.repaint();
	}
	
	public void GamePlay() {

		// Handle Left and Right Key Press
		if (leftKeyPressed && rightKeyPressed) {
			paddle.SetSpeedX(0);
		} else if (leftKeyPressed) {
			paddle.SetSpeedX(-paddleSpeedX);
		} else if (rightKeyPressed) {
			paddle.SetSpeedX(paddleSpeedX);
		} else {
			paddle.SetSpeedX(0);
		}
		
		EdgeDetectionBall(ball);
		
		for(Object o : movableDrawableElements) {
			((Movable)o).Move();
		}
		
		EdgeDetectionPaddle(paddle);
		
		EdgeDetectionPaddleBall(paddle, ball);
	}
	
	public void EdgeDetectionBall(Drawable o) {
		int screenTop = 0;
		int screenBottom = screenHeight;
		int screenLeft = 0;
		int screenRight = screenWidth;
		
		if (o.GetY() - o.GetHeight()/2 <= screenTop) {
			o.ReverseY();
		}
		else if (o.GetY() + o.GetHeight()/2 >= screenBottom) {
			
		}
		if (o.GetX() - o.GetWidth()/2 <= screenLeft || o.GetX() + o.GetWidth()/2 >= screenRight) {
			o.ReverseX();
		}
	}
	
	public void EdgeDetectionPaddle(Drawable o) {
		int screenLeft = 0;
		int screenRight = screenWidth;
		if (o.GetX() - o.GetWidth()/2 <= screenLeft) {
			o.SetX(screenLeft + (o.GetWidth() / 2));
		} else if (o.GetX() + o.GetWidth()/2 >= screenRight) {
			o.SetX(screenRight - (o.GetWidth() / 2));
		}
	}
	
	public void EdgeDetectionPaddleBall(Paddle paddle, Ball ball) {
		boolean widthTouching = false;
		boolean heightTouching = false;
		if (Math.abs(paddle.GetX() - ball.GetX()) < paddle.GetWidth()/2 + ball.GetWidth()/2) {
			widthTouching = true;
		}
		if (Math.abs(paddle.GetY() - ball.GetY()) < paddle.GetHeight()/2 + ball.GetHeight()/2) {
			heightTouching = true;
		}
		if (widthTouching && heightTouching) {
			ball.SetSpeedY(-Math.abs(ball.GetSpeedY()));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKeyPressed = true;
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKeyPressed = true;
			}
		}
		
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKeyPressed = false;
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKeyPressed = false;
			}
		}
	}
	
	public class MyMouseListener extends MouseAdapter {

		public void mouseEntered(MouseEvent e) {}

		public void mouseExited(MouseEvent e) {}

		public void mousePressed(MouseEvent e) {}

		public void mouseReleased(MouseEvent e) {}

	}
	
	public class MyMouseMotionListener extends MouseMotionAdapter {

		public void mouseDragged(MouseEvent e) {}

		public void mouseMoved(MouseEvent e) {
	
		}

	}

}
