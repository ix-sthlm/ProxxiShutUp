package com.Ix.ShutUp;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "ShutUp!";
		cfg.width = 1024;
		cfg.height = 1024;
		
		new LwjglApplication(new ShutUpApp(), cfg);
	}
}
