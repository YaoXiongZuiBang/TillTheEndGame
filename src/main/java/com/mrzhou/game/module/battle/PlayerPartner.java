package com.mrzhou.game.module.battle;


import com.alibaba.fastjson.JSON;
import com.mrzhou.game.module.organism.OrganismState;

import java.util.Observable;

/**
 * 类说明：玩家参与者
 * 创建者：Zeros
 * 创建时间：2019-03-30 13:58
 * 包名：com.mrzhou.game.module.battle
 */

public class PlayerPartner extends AbstractPartner{

    public PlayerPartner(AbstractMediator mediator, OrganismState state) {
        super(mediator, state);
    }

    @Override
    public void attack() {
        this.getMediator().roundAttack(this);
    }

    @Override
    public void setOrganismState() {

    }

    public void attackTarget(AbstractPartner npcBatch) {
        Integer attack = 100;
        OrganismState state = npcBatch.getPartnerState();
        System.out.println(state);
        state.attacked(attack);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("player被攻击");
        System.out.println(JSON.toJSONString(o));
        System.out.println(JSON.toJSONString(arg));
    }
}
