package com.zenapps.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zenapps.Screen.GameScreen;

//Juan is Cool
public class Main extends Game {

	@Override
	public void create() {
		Gdx.app.log("Main", "game created");
		setScreen(new GameScreen());
	}
}
