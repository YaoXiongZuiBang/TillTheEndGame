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
        mapBuilder.buildBackground();
        mapBuilder.buildFloor();
        mapBuilder.buildObstacle();
        return mapBuilder.getResult();
    }
}
