package com.Ix.ShutUp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.Array;

public class Resources {
	private static Array<Texture> Ear = new Array<Texture>();
	private static Array<BitmapFont> Fonts = new Array<BitmapFont>();

	public static void loadEar()
	{
		if(Ear.size <= 0)
		{
			Ear.add(new Texture(Gdx.files.internal("ear/ear_01.png")));
			Ear.add(new Texture(Gdx.files.internal("ear/ear_02.png")));
			Ear.add(new Texture(Gdx.files.internal("ear/ear_03.png")));
			Ear.add(new Texture(Gdx.files.internal("ear/ear_04.png")));
			Ear.add(new Texture(Gdx.files.internal("ear/ear_05.png")));
		}
	}
	
	public static Array<Texture> getEar()
	{
		return Ear;
	}
	
	public static void loadFonts()
	{
		Fonts.add(new BitmapFont(Gdx.files.internal("fonts/test.fnt"),
		        Gdx.files.internal("fonts/test.png"), false));
		Fonts.add(new BitmapFont(Gdx.files.internal("fonts/YellowItalicBoldVerdana.fnt"),
		        Gdx.files.internal("fonts/YellowItalicBoldVerdana.png"), false));
	}
	
	public static Array<BitmapFont> getFonts()
	{
		return Fonts;
	}

}