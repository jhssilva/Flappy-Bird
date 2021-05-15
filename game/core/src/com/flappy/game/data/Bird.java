package com.flappy.game.data;

public class Bird extends Object{
	
	public Bird(Pos pos) {
		super(pos);
	}
	
	public Bird(Pos pos, Dimensions dim, Speed speed) {
		super(pos, dim, speed);
		// TODO Auto-generated constructor stub
	}
	
	public void BirdUp() {
		this.setPos(new Pos(getPos().getX(), getPos().getY() + getSpeed().getY()));
	}
	
	public void BirdDown() {
		this.setPos(new Pos(getPos().getX(), getPos().getY() - getSpeed().getY()));
	}
	
	public void setBirdSpeed(float xspeed, float yspeed) {
		this.setSpeed(new Speed(xspeed, yspeed));
	}
	
}
