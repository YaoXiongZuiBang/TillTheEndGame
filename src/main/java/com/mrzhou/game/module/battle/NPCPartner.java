package com.mrzhou.game.module.battle;


import com.alibaba.fastjson.JSON;
import com.mrzhou.game.module.organism.OrganismState;

import java.util.Observable;

/**
 * 类说明：npc参与者
 * 创建者：Zeros
 * 创建时间：2019-03-30 13:58
 * 包名：com.mrzhou.game.module.battle
 */

public class NPCPartner extends AbstractPartner{

    public NPCPartner(AbstractMediator mediator, OrganismState state) {
        super(mediator, state);
    }

    @Override
    public void attack() {

    }


    public void attackTarget(PlayerPartner player) {
        OrganismState own = this.getPartnerState();
        OrganismState state = player.getPartnerState();
        int attack = own.getAttack() - state.getDefence();
        state.attacked(attack > 0 ? attack : 0);
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("npc被攻击");
        System.out.println(JSON.toJSONString(o));
        System.out.println(JSON.toJSONString(arg));
    }
}
