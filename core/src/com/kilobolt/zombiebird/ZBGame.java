package com.kilobolt.zombiebird;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;
import com.kilobolt.hungryHelpers.AssetLoader;
import com.kilobolt.screens.SplashScreen;

public class ZBGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		Gdx.app.log("ZBGame", "created");
        AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose () {
		super.dispose();
		AssetLoader.dispose();
	}
}
