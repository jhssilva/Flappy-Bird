package com.flappy.game.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Pipe{
	private String texture_pipe = "tube.png";
	private String pipe_bottom_down = "tubebottomdown.png";
	private String pipe_bottom_top = "tubebottomtop.png";
	private String tube_bottom_down = "tubebottomdown.png";
	private String tube_bottom_top = "tubebottomtop.png";
	private int distance_between_y = 110;
	private int distance_between_x = 225;
	private int distance_between_y_combine = this.distance_between_y * 2;
	private Pos pos;
	private Texture pipe_texture,texture_tubebottom_down,texture_tubebottom_top;

	private float size_pipe_y = 444;
	private float size_tubebottom_y = 35;
	private float size_tubebottom_x = 80;

	
	private Object pipe_top, pipe_bottom, tubebottom_down, tubebottom_top;
	
	public Pipe() {
		super();
	
	}
	

	public Pipe(float pos_x, float pos_y) {
		super();
		//set textures
		this.pipe_texture = new Texture(Gdx.files.internal(texture_pipe)); 
		this.texture_tubebottom_down = new Texture(Gdx.files.internal(tube_bottom_down));
		this.texture_tubebottom_top = new Texture(Gdx.files.internal(tube_bottom_top));
		
		this.pos = new Pos(pos_x,pos_y);
				
		// Set Pipe TOP
		Pos pos_top = new Pos(pos_x, pos_y + distance_between_y + (size_pipe_y / 2));
		this.pipe_top = new Object(pos_top); 
		
		Pos pos_tubebottom_top = new Pos(pos_x -2, (this.pipe_top.getPos().getY() - (this.size_tubebottom_y)));
		this.tubebottom_top = new Object(pos_tubebottom_top);
				
		
		// Set Pipe Bottom
		Pos pos_bottom = new Pos(pos_x, (pos_y - distance_between_y - (size_pipe_y / 2)));
		this.pipe_bottom = new Object(pos_bottom);
		
		Pos pos_tubebottom_down = new Pos(pos_x - 2 , (size_pipe_y + (this.pipe_bottom.getPos().getY())));
		this.tubebottom_down = new Object(pos_tubebottom_down);
	}

	// Function that handles pipesMovement
	public void pipesMovement(float movement) {
		this.pipe_bottom.getPos().setX(this.pipe_bottom.getPos().getX() - movement);
		this.tubebottom_down.getPos().setX(this.tubebottom_down.getPos().getX() - movement);
		this.pipe_top.getPos().setX(this.pipe_top.getPos().getX() - movement);
		this.tubebottom_top.getPos().setX(this.tubebottom_top.getPos().getX() - movement);
	}
	
	
	// Function that handles bird collision with pipes
	public boolean checkColisionWithPipe(Pos pos) {
		
		return false;
	}
	
	
	
	
	public float getSize_tubebottom_y() {
		return size_tubebottom_y;
	}


	public void setSize_tubebottom_y(float size_tubebottom_y) {
		this.size_tubebottom_y = size_tubebottom_y;
	}


	public float getSize_tubebottom_x() {
		return size_tubebottom_x;
	}


	public void setSize_tubebottom_x(float size_tubebottom_x) {
		this.size_tubebottom_x = size_tubebottom_x;
	}


	public String getTube_bottom_down() {
		return tube_bottom_down;
	}


	public void setTube_bottom_down(String tube_bottom_down) {
		this.tube_bottom_down = tube_bottom_down;
	}


	public String getTube_bottom_top() {
		return tube_bottom_top;
	}


	public void setTube_bottom_top(String tube_bottom_top) {
		this.tube_bottom_top = tube_bottom_top;
	}


	public Texture getTexture_tubebottom_down() {
		return texture_tubebottom_down;
	}


	public void setTexture_tubebottom_down(Texture texture_tubebottom_down) {
		this.texture_tubebottom_down = texture_tubebottom_down;
	}


	public Texture getTexture_tubebottom_top() {
		return texture_tubebottom_top;
	}


	public void setTexture_tubebottom_top(Texture texture_tubebottom_top) {
		this.texture_tubebottom_top = texture_tubebottom_top;
	}


	public Object getTubebottom_down() {
		return tubebottom_down;
	}


	public void setTubebottom_down(Object tubebottom_down) {
		this.tubebottom_down = tubebottom_down;
	}


	public Object getTubebottom_top() {
		return tubebottom_top;
	}


	public void setTubebottom_top(Object tubebottom_top) {
		this.tubebottom_top = tubebottom_top;
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



	public void setDistance_between_y(int distance_between_y) {
		this.distance_between_y = distance_between_y;
	}


	public void setDistance_between_x(int distance_between_x) {
		this.distance_between_x = distance_between_x;
	}


	public void setDistance_between_y_combine(int distance_between_y_combine) {
		this.distance_between_y_combine = distance_between_y_combine;
	}


	public float getDistance_between_x() {
		return distance_between_x;
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


	public float getDistance_between_y_combine() {
		return distance_between_y_combine;
	}


}
