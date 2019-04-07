package com.mrzhou.game.module.battle;

import lombok.Data;


/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-30 13:56
 * 包名：com.mrzhou.game.module.battle
 */

@Data
public class BattleMediator extends AbstractMediator{
    PlayerPartner player;

    NPCPartner npcPartner;

    @Override
    public void roundAttack(AbstractPartner partner) {
        if (this.player == partner){
            player.attackTarget(npcPartner);
        }else{
            npcPartner.attackTarget(player);
        }
    }
}
