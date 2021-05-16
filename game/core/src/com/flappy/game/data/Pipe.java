package com.flappy.game.data;

public class Pipe{
	private String texture_pipe = "tube.png";
	private String pipe_bottom_down = "tubebottomdown.png";
	private String pipe_bottom_top = "tubebottomtop.png";
	private float distance_between = 100;
	
	private Object pipe_top, pipe_bottom;
	
	public Pipe() {
		super();
	
	}
	

	public Pipe(float pos_x, float pos_y) {
		super();
		
		//	public Object(Pos pos, Dimensions dim, Speed speed)
		this.pipe_top = new Object(new Pos(pos_x, pos_y)); 
		//this.pipe_bottom;
		
	}


	public boolean checkColisionWithPipe(Pos pos) {
		
		return false;
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


	public String getPipe_bottom_top() {
		return pipe_bottom_top;
	}


	public void setPipe_bottom_top(String pipe_bottom_top) {
		this.pipe_bottom_top = pipe_bottom_top;
	}


	public float getDistance_between() {
		return distance_between;
	}


	public void setDistance_between(float distance_between) {
		this.distance_between = distance_between;
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



	

}
