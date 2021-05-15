package com.flappy.game.data;

import java.util.ArrayList;

public class World {
	Bird bird;
	ArrayList<Pipe> pipes;
	Dimensions window;
	private float gravity = 9.8f;
	
	public World() {
		super();
	}
	
	public World(Dimensions window) {
		super();	
		this.window = window;
	}
	
	public void config() {
		//set bird
		this.setBird(new Bird(new Pos(this.getWindow().getWeight() / 2,
				this.getWindow().getHeight() / 2)));
		this.getBird().setSpeed(new Speed(0, this.getGravity()));
	}
	
	public Bird getBird() {
		return bird;
	}
	public void setBird(Bird bird) {
		this.bird = bird;
	}
	public ArrayList<Pipe> getPipes() {
		return pipes;
	}
	public void setPipes(ArrayList<Pipe> pipes) {
		this.pipes = pipes;
	}
	public Dimensions getWindow() {
		return window;
	}
	public void setWindow(Dimensions window) {
		this.window = window;
	}

	public float getGravity() {
		return gravity;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}
	

}
