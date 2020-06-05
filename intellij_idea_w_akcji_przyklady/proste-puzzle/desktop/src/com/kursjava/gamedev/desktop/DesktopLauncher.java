package com.kursjava.gamedev.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kursjava.gamedev.SimpleJigsawPuzzleGame;

public class DesktopLauncher {
  public static void main (String[] arg) {
    LwjglApplicationConfiguration config =
        new LwjglApplicationConfiguration();

    config.resizable = false;
    config.width = SimpleJigsawPuzzleGame.WINDOW_WIDTH;
    config.height = SimpleJigsawPuzzleGame.WINDOW_HEIGHT;
    config.title = "Simple Puzzle Game - https://kursjava.com";

    new LwjglApplication(new SimpleJigsawPuzzleGame(), config);
  }
}
