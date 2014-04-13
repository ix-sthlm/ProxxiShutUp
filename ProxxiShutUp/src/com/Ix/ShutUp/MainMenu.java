package com.Ix.ShutUp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

public class MainMenu  implements Screen{
	//Needed for most things
	final ShutUpApp game;
	int width = Gdx.graphics.getWidth();
	int height = Gdx.graphics.getHeight();
	private SpriteBatch spriteBatch;
	Point touchPos;
	private OrthographicCamera camera;
	private Array<Button> Buttons = new Array<Button>();
	
	public MainMenu(final ShutUpApp game)
	{
        this.game = game;
	}
	
	private BitmapFont font1;
	private static Array<Sprite> Ear = new Array<Sprite>();
	private static Array<LogLine> Log = new Array<LogLine>();
	float noice;
	
	@Override
	public void render(float delta) {
		//Set Background color to Red
		Gdx.graphics.getGL20().glClearColor( 1, 0, 0, 1 );	
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(Log.size > 0)
		{
		noice = Log.get(Log.size-1).getNoice();
		}
		else
		{
			noice = 0;
		}
		
        spriteBatch.begin();
        //Draw Ear
        spriteBatch.draw(Ear.get((int)noice),0, 0, width, height);
        
        //Draw MainMenu Buttons to the left
        for(Button button : Buttons)
        {
        	if(button.getSprite() != null)
        	{
        		spriteBatch.draw(button.getSprite(), button.getLocation().x, button.getLocation().y);
        	}
	        font1.draw(spriteBatch, button.getText(), button.getTextLocation().x, button.getTextLocation().y);
        }
        spriteBatch.end();
        if(noice < 4)
        {
        	noice++;
        }
        else
        {
        	noice = 0;
        }
       
        
        //Check for inputs
        if(Gdx.input.justTouched())
        {
        	//Get the Point that was touched
        	Vector3 touchPos = new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0);
        	System.out.println(touchPos);
        	camera.unproject(touchPos);
        	
        	//Check if any of the buttons where pressed
        	for(int i = 0; i < Buttons.size; i++)
            {
        		Button button = Buttons.get(i);
        		if(button.isTouched(touchPos))
            	{
        			System.out.println("Pressed " + button.getText());
	        		switch (i)
	        		{
	        			case 0:
	        					//game.setScreen(new NewGameScreen(game));
	        				break;
	        		}
            	}
            }
        }
	}
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		//Everything that should be loaded when the Screen appears
		camera = new OrthographicCamera();
        camera.setToOrtho(false, width, height);
        spriteBatch = new SpriteBatch();
        font1 = Resources.getFonts().get(0);
        
        //Ladda in saker specefikt för denna screen
		Array<Texture> tempEar = Resources.getEar();
		for(Texture txtu : tempEar)
		{
			Ear.add(new Sprite(txtu));
		}
		
		//Make Buttons
		//Buttons.add(new Button(cloudButtonSprite, "New Game", new Point(width/100*1, height/100*60)));
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	
}
