package com.flappy.game;

import com.flappy.game.data.Bird;
import com.flappy.game.data.World;
import com.flappy.game.data.Pos;

public class Game {
	World world;
	boolean run = false;
	
	public Game() {
		super();
		
	}
	
	//Function that initialize the game
	public void init() {
		this.world = new World();
		this.conf();
		this.run();
	}
	
	// Function that sets the environment of the game
	private void conf() {
		this.world.setBird(new Bird(new Pos(50,50)));
	}
	
	private void run() {
		
		
		
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
