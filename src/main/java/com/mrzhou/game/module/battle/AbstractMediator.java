package com.mrzhou.game.module.battle;

import lombok.Data;

/**
 * 类说明：抽象中介者
 * 创建者：Zeros
 * 创建时间：2019-03-30 13:52
 * 包名：com.mrzhou.game.module.battle
 */

@Data
public abstract class AbstractMediator {

    /**
     * 回合攻击方法
     * @param partner
     */
    public abstract void roundAttack(AbstractPartner partner);
}
