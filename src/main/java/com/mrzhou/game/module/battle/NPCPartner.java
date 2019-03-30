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

    @Override
    public void setOrganismState() {

    }

    public void attackTarget(PlayerPartner player) {
        Integer attack = 50;
        OrganismState state = player.getPartnerState();
        state.attacked(attack);
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("npc被攻击");
        System.out.println(JSON.toJSONString(o));
        System.out.println(JSON.toJSONString(arg));
    }
}
