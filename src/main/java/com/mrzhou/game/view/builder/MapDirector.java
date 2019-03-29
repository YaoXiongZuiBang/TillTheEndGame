package com.mrzhou.game.view.builder;

public class MapDirector {
    private MapBuilder mapBuilder;

    public MapDirector(MapBuilder mapBuilder){
        this.mapBuilder = mapBuilder;
    }

    public void setMapBuilder(MapBuilder mapBuilder) {
        this.mapBuilder = mapBuilder;
    }

    public MapPanel construct(){
        mapBuilder.buildBg();
        mapBuilder.buildBackground();
        mapBuilder.buildFloor();
        mapBuilder.buildPlayer();
        mapBuilder.buildNPC();
        mapBuilder.buildObstacle();
        return mapBuilder.getResult();
    }
}
