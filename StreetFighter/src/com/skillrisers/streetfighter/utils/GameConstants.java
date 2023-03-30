package com.skillrisers.streetfighter.utils;

public interface GameConstants {
	String TITLE = ConfigReader.getValue("game.title");
	int SCREENWIDTH = Integer.parseInt(ConfigReader.getValue("game.width"));
	int SCREENHEIGHT = Integer.parseInt(ConfigReader.getValue("game.height"));
}
