package com.flappy.game.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Bird extends Object{
	private String normal_bird= "bird1.png";
	private String jump_bird = "bird2.png";
	private float gravity = 2.7f;
	
	
	public Bird(Pos pos) {
		super(pos);
		this.newTextureNormalBird();
	}
	
	public Bird(Pos pos, Dimensions dim, Speed speed) {
		super(pos, dim, speed);
		this.newTextureNormalBird();
		
		// TODO Auto-generated constructor stub
	}
	
	public void setBirdSpeed(float xspeed, float yspeed) {
		this.setSpeed(new Speed(xspeed, yspeed));
	}
	
	public void setBirdSpeedY(float yspeed) {
		this.getSpeed().setY(yspeed);
	}
	
	public void birdMovement() {
		this.setPos(new Pos(getPos().getX() + getSpeed().getX(), getPos().getY() + getSpeed().getY()));
	}
	
	public void setBirdGravityMovement() {
		this.setBirdSpeedY(-this.getGravity());
	}
	
	public void BirdJump() {
		this.getSpeed().setY(20*gravity);
		this.setTexture(new Texture(Gdx.files.internal(jump_bird)));
	}
	
	private void newTextureNormalBird() {
		this.setTexture(new Texture(Gdx.files.internal(normal_bird))); 
	}

	public String getNormal_bird() {
		return normal_bird;
	}

	public void setNormal_bird(String normal_bird) {
		this.normal_bird = normal_bird;
	}

	public float getGravity() {
		return gravity;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}

	
}
