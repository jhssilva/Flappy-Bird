package com.flappy.game.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Pipe{
	private String texture_pipe = "tube.png";
	private String pipe_bottom_down = "tubebottomdown.png";
	private String pipe_bottom_top = "tubebottomtop.png";
	private float distance_between_y = 100;
	private float distance_between_x = 225;
	private Pos pos;
	private Texture pipe_texture;
	private float size_pipe_y = 447;
	
	private Object pipe_top, pipe_bottom;
	
	public Pipe() {
		super();
	
	}
	

	public Pipe(float pos_x, float pos_y) {
		super();
		this.pipe_texture = new Texture(Gdx.files.internal(texture_pipe)); 
		
		
		this.pos = new Pos(pos_x,pos_y);
				
		Pos pos_top = new Pos(pos_x, pos_y + distance_between_y + (size_pipe_y/2));
		this.pipe_top = new Object(pos_top); 
		
		Pos pos_bottom = new Pos(pos_x, pos_y - distance_between_y - (size_pipe_y / 2));
		this.pipe_bottom = new Object(pos_bottom);
		
	}


	public void pipesMovement(float movement) {
		this.pipe_bottom.getPos().setX(this.pipe_bottom.getPos().getX() - movement);
		this.pipe_top.getPos().setX(this.pipe_top.getPos().getX() - movement);
	}
	
	public boolean checkColisionWithPipe(Pos pos) {
		
		return false;
	}
	
	public void setPosX(float x) {
		this.getPos().setX(x);
	}


	public String getTexture_pipe() {
		return texture_pipe;
	}


	public void setTexture_pipe(String texture_pipe) {
		this.texture_pipe = texture_pipe;
	}


	public String getPipe_bottom_down() {
		return pipe_bottom_down;
	}


	public void setPipe_bottom_down(String pipe_bottom_down) {
		this.pipe_bottom_down = pipe_bottom_down;
	}

	
	
	public float getSize_pipe_y() {
		return size_pipe_y;
	}


	public void setSize_pipe_y(float size_pipe_y) {
		this.size_pipe_y = size_pipe_y;
	}


	public String getPipe_bottom_top() {
		return pipe_bottom_top;
	}


	public void setPipe_bottom_top(String pipe_bottom_top) {
		this.pipe_bottom_top = pipe_bottom_top;
	}


	public float getDistance_between_y() {
		return distance_between_y;
	}


	public void setDistance_between_y(float distance_between_y) {
		this.distance_between_y = distance_between_y;
	}


	public float getDistance_between_x() {
		return distance_between_x;
	}


	public void setDistance_between_x(float distance_between_x) {
		this.distance_between_x = distance_between_x;
	}


	public Object getPipe_top() {
		return pipe_top;
	}


	public void setPipe_top(Object pipe_top) {
		this.pipe_top = pipe_top;
	}


	public Object getPipe_bottom() {
		return pipe_bottom;
	}


	public void setPipe_bottom(Object pipe_bottom) {
		this.pipe_bottom = pipe_bottom;
	}


	public Pos getPos() {
		return pos;
	}


	public void setPos(Pos pos) {
		this.pos = pos;
	}


	public Texture getPipe_texture() {
		return pipe_texture;
	}


	public void setPipe_texture(Texture pipe_texture) {
		this.pipe_texture = pipe_texture;
	}



	

}
