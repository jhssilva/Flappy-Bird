package com.flappy.game.data;

public class Dimensions {
	private float weight;
	private float height;
	private float dist;
	
	public Dimensions(float weight, float height) {
		super();
		this.weight = weight;
		this.height = height;

	}
	
	public Dimensions(float dist) {
		super();
		this.dist = dist;
	}

	
	public float getDist() {
		return dist;
	}

	public void setDist(float dist) {
		this.dist = dist;
	}

	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
}
