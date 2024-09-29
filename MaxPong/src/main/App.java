package main;

import javax.swing.JFrame;

public class App extends JFrame {
	
	public App(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main mainGame = new Main(this);
		this.add(mainGame);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new App("PongGame");

	}

}
