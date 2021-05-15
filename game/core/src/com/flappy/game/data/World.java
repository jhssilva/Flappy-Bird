package com.flappy.game.data;

import java.util.ArrayList;

public class World {
	Bird bird;
	ArrayList<Pipe> pipes;
	Dimensions window;
	
	public World() {
		super();
		
		
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
	
	
	
	
}
