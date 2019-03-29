package com.mrzhou.game.view.builder;

public abstract class  MapBuilder {
   protected MapPanel mapPanel = new MapPanel();

   public abstract void buildBackground();
   public abstract void buildFloor();
   public abstract void buildObstacle();

   public MapPanel getResult(){
       return mapPanel;
   }
}
