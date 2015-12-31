package the.game.gop.main;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage spriteSheet;
	
	public SpriteSheet() {
		
	}
	//Targets a specific sprite sheet
	public void setSpriteSheet(BufferedImage spriteSheet) {
		this.spriteSheet = spriteSheet;
	}
	//Returns a given set of tiles (sprite)
	public BufferedImage getTile(int xTile, int yTile, int width, int height)
	{
		BufferedImage sprite = spriteSheet.getSubimage(xTile, yTile, width, height);
		return spriteSheet;
				
	}
}
