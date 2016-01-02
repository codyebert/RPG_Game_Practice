 package my.sp.gameloop;

import java.awt.Component;

import my.sp.GameState.GameStateManager;
import my.sp.main.Assets;
import the.game.gop.main.ACGameLoop;
import the.game.gop.main.Vector2F;

public class GameLoop extends ACGameLoop{
	
	GameStateManager gsm;
	public static Assets assets = new Assets();

	public GameLoop(int width, int height) {
		super(width, height);
	}
	public static float xOffSet;
	public static float yOffSet;
	@Override
	//Initialize function
	public void init() {
		assets.init();
		Vector2F.setWorldVariables(xOffSet, yOffSet);
		gsm = new GameStateManager();
		gsm.init();
		super.init();
	}
	@Override
	//Tick function
	public void tick(double deltaTime) {
		Vector2F.setWorldVariables(xOffSet, yOffSet);
		gsm.tick(deltaTime); 
	
	}
	@Override
	//Clear function
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}
	@Override
	//Render function
	public void render() {
		// TODO Auto-generated method stub
		super.render();
		gsm.render(graphics2D);
		clear();
	}
	

}
