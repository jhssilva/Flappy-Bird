package com.flappy.game;

import com.flappy.game.data.Bird;
import com.flappy.game.data.Dimensions;
import com.flappy.game.data.World;
import com.flappy.game.data.Pos;

public class Game extends Thread {
	private World world;
	private boolean run = false;
	
	public Game() {
		super();
		
	}
	
	//Function that initialize the game
	public void init(float windows_width, float windows_height) {
		this.world = new World(new Dimensions(windows_width, windows_height));
		this.conf();
		this.setRun(true);
	}
	
	// Function that sets the environment of the game
	private void conf() {
		this.getWorld().config();
	}
	
	
	//function that does a new interaction
	public void tick() {
		
		if(this.run) {
					
			this.checkColision();
			this.birdMovement();
			this.getWorld().getBird().setBirdGravityMovement();
			this.world.movement();
			
			
		}else {
			this.init(this.getWorld().getWindow().getWeight(), this.getWorld().getWindow().getHeight());
		}
		
	}
	
	public void checkColision() {
		if(this.getWorld().getBird().getPos().getY() > this.getWorld().getWindow().getHeight()) {
			this.getWorld().getBird().setBirdGravityMovement();
		}else if(this.getWorld().getBird().getPos().getY() < 0) {
			this.setRun(false);
		}
	}
	
	
	public void birdMovement(){
		this.getWorld().getBird().birdMovement();
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
	

	
}
