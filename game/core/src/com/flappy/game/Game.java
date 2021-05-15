package com.flappy.game;

import com.flappy.game.data.Bird;
import com.flappy.game.data.Dimensions;
import com.flappy.game.data.World;
import com.flappy.game.data.Pos;

public class Game {
	private World world;
	private boolean up = false;
	private boolean run = false;
	
	public Game() {
		super();
		
	}
	
	//Function that initialize the game
	public void init(float windows_width, float windows_height) {
		this.world = new World(new Dimensions(windows_width, windows_height));
		this.conf();
		this.run();
	}
	
	// Function that sets the environment of the game
	private void conf() {
		this.getWorld().config();
	}
	
	private void run() {
		this.run = true;
	}
	
	//function that does a new interaction
	public void interaction() {
		
		//60 fps
		this.fps60();
		
		//Verify if  the bird hit something.
		
		
		//Move the bird
		if(up) {
			this.birdUp();
		}else {
			this.birdDown();
		}
		
		this.setUp(false);
	}
	
	private void fps60() {
		System.out.println("set the fps function");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void birdUp() {
		this.getWorld().getBird().BirdUp();
	}
	
	private void birdDown() {
		this.getWorld().getBird().BirdDown();
	}
	
	
	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}


	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}
	
}
