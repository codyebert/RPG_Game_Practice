package my.sp.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import my.sp.gameloop.GameLoop;
import the.game.gop.main.GameWindow;
import the.game.gop.main.SpriteSheet;

public class Main {
	 	
	public static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	public static int width = gd.getDisplayMode().getWidth();
	public static int height = gd.getDisplayMode().getHeight();

	public static void main(String[] args) {
		
	
		GameWindow frame = new GameWindow("The Seven Pillars", width, height);
		//Full screen is broken
		frame.setFullscreen(1);
		frame.add(new GameLoop(width, height));
		
		frame.setVisible(true);
		
		
	}

}
