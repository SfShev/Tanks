package org.example.Game.Level;

import org.example.Game.Game;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Level {

    public static final int TILE_SCALE = 8;
    public static final int TILE_IN_GAME_SCALE = 1;
    public static final int TILES_IN_WIDTH = Game.WIDTH / (TILE_SCALE * TILE_IN_GAME_SCALE);
    public static final int TILES_IN_HEIGHT = Game.HEIGHT / (TILE_SCALE * TILE_IN_GAME_SCALE);
    public static final Map<TileType,Tile> tiles = new HashMap<TileType,Tile>();
    private int [][] tileMap;


    public Level(){
        tileMap = new int[TILES_IN_WIDTH][TILES_IN_HEIGHT];
    }

    public void update (){}
    public void render (Graphics2D g ){

    }

}
