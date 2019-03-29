package com.mrzhou.game.view.builder;

public abstract class  MapBuilder {
   protected MapPanel mapPanel = new MapPanel();

   public abstract void buildBg();
   public abstract void buildBackground();
   public abstract void buildFloor();
   public abstract void buildObstacle();
   public abstract void buildNPC();
   public abstract void buildPlayer();

   public MapPanel getResult(){
       return mapPanel;
   }
}
