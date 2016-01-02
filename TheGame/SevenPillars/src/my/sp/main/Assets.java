package my.sp.main;

import java.awt.image.BufferedImage;

import the.game.gop.main.SpriteSheet;
import the.game.gop.main.loadImageFrom;

public class Assets {
	
	SpriteSheet blocks = new SpriteSheet();
	private  BufferedImage stone_1;
	public void init()
	{
		blocks.setSpriteSheet(loadImageFrom.LoadImageFrom(Main.class, "spriteSheet.png"));
		stone_1 = blocks.getTile(0, 0, 16, 16);
	}

}
