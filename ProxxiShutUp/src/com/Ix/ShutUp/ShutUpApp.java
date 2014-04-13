package com.Ix.ShutUp;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class ShutUpApp extends Game {
	
	@Override
	public void create() {
		Resources.loadEar();
		Resources.loadFonts();
		this.setScreen(new MainMenu(this));
		Gdx.graphics.setTitle("ShutUpApp game");
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {
		super.render(); //important!
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
