package com.mrzhou.game.module.npc;

import com.mrzhou.game.module.organism.Npc;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SecondNpc {

    private List<Npc> npcList;

    private int level1Count = 10;

    private int level2Count = 2;

    public SecondNpc(){
        npcList = new ArrayList<>();
        Npc level1 = new Npc(100, 10, 1, "/img/npc/npc_1.png", "/img/npc/npc_12.png");
        Npc level2 = new Npc(200, 20, 2, "/img/npc/npc_2.png","/img/npc/npc_2.png");
        try {
            for(int i=0; i<level1Count; i++){
                npcList.add(level1.clone());
            }
            for(int i=0; i<level2Count; i++){
                npcList.add(level2.clone());
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    public List<Npc> getNpcList() {
        return npcList;
    }
}
