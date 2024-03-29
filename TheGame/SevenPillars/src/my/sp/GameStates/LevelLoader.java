package my.sp.GameStates;

import java.awt.Graphics2D;

import my.sp.GameState.GameState;
import my.sp.GameState.GameStateManager;
import my.sp.generator.Map;
import my.sp.main.Main;
import the.game.gop.main.SpriteSheet;
import the.game.gop.main.loadImageFrom;

public class LevelLoader extends GameState {

	Map map;	
		public LevelLoader(GameStateManager gsm) {
		super(gsm);
			}

	@Override
	public void init() {
		map = new Map();
		map.init();
	}

	@Override
	public void tick(double deltaTime) {
				map.tick(deltaTime);
	}

	@Override
	public void render(Graphics2D g) {
			g.drawString("Hello World!", 200, 200);
			map.render(g);		
	}

}
