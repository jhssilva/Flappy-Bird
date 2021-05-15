package com.flappy.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class FlappyGame extends ApplicationAdapter {
	
	private Game game;
	
	public SpriteBatch batch;
	public BitmapFont font;
	ShapeRenderer shapeRenderer;
	Texture texture_background, 
			pipe_bellow,
			pipe_above;
	
	float x = 0;
	float y = -100;
	int srcX = 0;
	int srcY =  0;
	int srcWidth = 100;
	int srcHeight = 100;
	
	float circleX = 100;
	float circleY = 50;
	
	float xSpeed = 0;
	float ySpeed = 2;
	
	
	@Override
	public void create () {
		// Create game configuration
		this.game = new Game();
		this.game.init(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		// Painting configuration
		batch = new SpriteBatch();
		texture_background = new Texture(Gdx.files.internal("fund.jfif"));
		shapeRenderer = new ShapeRenderer();
		
		/*
		batch = new SpriteBatch();
		font = new BitmapFont();
		shapeRenderer = new ShapeRenderer();
		texture = new Texture(Gdx.files.internal("fund.jfif"));
		pipe_bellow = new Texture(Gdx.files.internal("pipe_upside.png"));
		windows_width = Gdx.graphics.getWidth();
		windows_height = Gdx.graphics.getHeight();
		circleX = windows_width / 8;
		circleY = windows_height / 2;
		*/
	}

	@Override
	public void render () {
		// Painting background
		Gdx.gl.glClearColor(86/255f, 193/255f, 203/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		batch.begin();
		batch.draw(texture_background,x,y,game.getWorld().getWindow().getWeight(), game.getWorld().getWindow().getHeight());
		batch.end();
		
		
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT) || Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
			this.game.setUp(true);
		}
		
		this.game.interaction();
		
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.circle(game.getWorld().getBird().getPos().getX(), game.getWorld().getBird().getPos().getY(), 10);
		shapeRenderer.end();
		
		/*
		Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		batch.begin();
		batch.draw(texture,x,y,windows_width, windows_height);
		//batch.draw(pipe_bellow, x, y, windows_width / 2, windows_height/3);
		font.draw(batch, "Flappy Bird", Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
		batch.end();
		
				
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(255,0,0,1);
		shapeRenderer.circle(circleX, circleY, 10);
		shapeRenderer.setColor(0,1,0,1);
		shapeRenderer.box(30, 20, 0, 100, 200, 0);
		
		shapeRenderer.end();
		*/
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
		
	}
	
}