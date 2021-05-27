package com.flappy.game.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class World {
	private Bird bird;
	private ArrayList<Pipe> pipes;
	private Dimensions window;
	private Random objGenerator;
	private int space_between_pipes = 225;
	private float movement = 2;
	private int pipe_max_y;
	private int pipe_min_y;
	private int pipe_size_y;
	private int tubes = 200;
	
	public World() {
		super();
	}
	
	public World(Dimensions window) {
		super();	
		this.window = window;
		this.objGenerator = new Random();
		Pipe aux_0 = new Pipe(0,0);
		this.setPipe_size_y((int)aux_0.getSize_pipe_y());
		this.pipe_max_y = (int)this.window.getHeight()- (int)(aux_0.getDistance_between_y_combine() + (aux_0.getSize_pipe_y()/2) + 50);
		this.pipe_min_y = (int)(aux_0.getSize_pipe_y()/2 + 50 - (aux_0.getDistance_between_y_combine()));

	}
	
	public void config() {
		this.configBird();		
		this.configPipes();
	}
	
	private void configPipes() {
		pipes = new ArrayList<Pipe>();
		Pipe aux_pipe;
		for(int i = 0; i < this.tubes; i++) {
			aux_pipe = new Pipe(window.getWeight()+ (i * this.space_between_pipes), this.getRandomHeightPipe());
			pipes.add(aux_pipe);	
		}
	}
	
	private void configBird() {
		this.setBird(new Bird(new Pos(100,
				300)));
		this.getBird().setSpeed(new Speed(0, -this.getBird().getGravity()));
	}
	
	public void movement() {
			
		// Pipes
		Iterator<Pipe> iterator_pipes = this.getPipes().iterator();
		Pipe aux;
		while(iterator_pipes.hasNext()) {
			aux = iterator_pipes.next();
			aux.pipesMovement(this.movement);
		}
		
	}
	

	
	public int getRandomHeightPipe() {
		return this.getRandomNumberBetween(this.pipe_min_y, this.pipe_max_y);
	}
	
	public int getRandomNumberBetween(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min)  ;
	}
	
	public Random getObjGenerator() {
		return objGenerator;
	}

	public void setObjGenerator(Random objGenerator) {
		this.objGenerator = objGenerator;
	}

	public int getSpace_between_pipes() {
		return space_between_pipes;
	}

	public void setSpace_between_pipes(int space_between_pipes) {
		this.space_between_pipes = space_between_pipes;
	}

	public float getMovement() {
		return movement;
	}

	public void setMovement(float movement) {
		this.movement = movement;
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

	public int getPipe_size_y() {
		return pipe_size_y;
	}

	public void setPipe_size_y(int pipe_size_y) {
		this.pipe_size_y = pipe_size_y;
	}

}
