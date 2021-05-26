package com.flappy.game.data;

import java.util.ArrayList;
import java.util.Iterator;

public class World {
	Bird bird;
	ArrayList<Pipe> pipes;
	Dimensions window;
	float movement = 2;
	
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
		float distance = 100;

		// 76 - 447
		Pipe aux_pipe = new Pipe(window.getWeight()-100, 50);
		pipes.add(aux_pipe);
		aux_pipe = new Pipe(window.getWeight()+125, 80);
		pipes.add(aux_pipe);
	}
	
	private void configBird() {
		this.setBird(new Bird(new Pos(100,
				300)));
		this.getBird().setSpeed(new Speed(0, -this.getBird().getGravity()));
	}
	
	public void movement() {
	
		// Pipes
		Iterator<Pipe> iterator_pipes = this.getPipes().iterator();
		
		while(iterator_pipes.hasNext()) {
			Pipe aux = iterator_pipes.next();
			aux.pipesMovement(this.movement);
		}
		
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
