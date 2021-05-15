package com.flappy.game.data;

public class Object {
	private Pos pos;
	private Dimensions dim;
	private Speed speed;
		
	public Object(Pos pos) {
		super();
		this.pos = pos;
	}

	public Object(Pos pos, Dimensions dim) {
		super();
		this.pos = pos;
		this.dim = dim;
	}
	
	public Object(Pos pos, Dimensions dim, Speed speed) {
		super();
		this.pos = pos;
		this.dim = dim;
		this.speed = speed;
	}

	public Pos getPos() {
		return pos;
	}
	public void setPos(Pos pos) {
		this.pos = pos;
	}
	public Dimensions getDim() {
		return dim;
	}
	public void setDim(Dimensions dim) {
		this.dim = dim;
	}
	public Speed getSpeed() {
		return speed;
	}
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
}
