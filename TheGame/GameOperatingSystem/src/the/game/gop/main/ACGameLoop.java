package the.game.gop.main;

import java.awt.Dimension;

import javax.swing.JPanel;

public class ACGameLoop extends JPanel implements Runnable{
	
	private Thread thread;
	private boolean running;
	 
	private int fps;
	private int tps;
	 
	private int height;
	private int width;
	
	public static double currFPS = 120D;
	
	
	public ACGameLoop(int width, int height)
	{
		this.width = width;
		this.height = height;
		
		setPreferredSize(new Dimension(width, height));
		setFocusable(false);
		requestFocus();
	}

	@Override
	public void addNotify() {
				super.addNotify();
			if(thread == null)
			{
				thread = new Thread(this);
				thread.start();
			}
	}
	@Override
	public void run() {
		/*INIT*/
		init();
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D / currFPS;
		int frames = 0;
		int ticks = 0;
		long lastTimer = System.currentTimeMillis();
		double deltaTime = 0;
		
		while(running)
		{
			long now = System.nanoTime();
			deltaTime += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = false;
			
			while(deltaTime >= 1)
			{
				ticks++;
				/*TICK + DELTATIME*/
				tick(deltaTime);
				deltaTime -= 1;
				shouldRender = true;
			}
			if(shouldRender == true)
			{
				frames++;
				/*RENDER*/
				 render();
			}
			
			//Sleeping
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(System.currentTimeMillis() - lastTimer >= 1000)
			{
				lastTimer +=1000;
				tps = frames;
				fps = ticks;
				frames = 0;
				ticks = 0;
			}
		}
	}

	private void init() {
		running = true;		
	}
	private void tick(double deltaTime) {
		// TODO Auto-generated method stub
		
	}
	private void render() {
		// TODO Auto-generated method stub
		
	}

	

	

}
