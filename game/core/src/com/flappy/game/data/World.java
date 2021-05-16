package com.flappy.game.data;

import java.util.ArrayList;

public class World {
	Bird bird;
	ArrayList<Pipe> pipes;
	Dimensions window;
	
	public World() {
		super();
	}
	
	public World(Dimensions window) {
		super();	
		this.window = window;
	}
	
	public void config() {
		this.configBird();		
		this.configPipes();
	}
	
	private void configPipes() {
		pipes = new ArrayList<Pipe>();
		
		Pipe aux_pipe = new Pipe();
		
		pipes.add(aux_pipe);
	}
	
	private void configBird() {
		this.setBird(new Bird(new Pos(100,
				300)));
		this.getBird().setSpeed(new Speed(0, -this.getBird().getGravity()));
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
