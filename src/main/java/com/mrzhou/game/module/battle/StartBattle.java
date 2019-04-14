package com.mrzhou.game.module.battle;

import com.mrzhou.game.module.organism.Npc;
import com.mrzhou.game.module.organism.OrganismState;
import com.mrzhou.game.module.organism.Player;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-30 16:12
 * 包名：com.mrzhou.game.module.battle
 */

public class StartBattle {

    public static void main(String[] args) {
        BattleMediator mediator = new BattleMediator();

        OrganismState state = Player.getInstance().obtainState();
        OrganismState s2 = new Npc(202, 30, 1, "","").getState();

        PlayerPartner playerPartner = new PlayerPartner(mediator, state);
        NPCPartner npcPartner = new NPCPartner(mediator, s2);
        mediator.setNpcPartner(npcPartner);
        mediator.setPlayer(playerPartner);

        playerPartner.attackTarget(npcPartner);
        npcPartner.attackTarget(playerPartner);
    }
}
