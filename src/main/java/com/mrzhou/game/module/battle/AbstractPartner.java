package com.mrzhou.game.module.battle;

import com.mrzhou.game.module.organism.OrganismState;
import lombok.Data;

import java.util.Observer;

/**
 * 类说明：抽象参与者
 * 创建者：Zeros
 * 创建时间：2019-03-30 13:52
 * 包名：com.mrzhou.game.module.battle
 */

@Data
public abstract class AbstractPartner implements Observer {
    private AbstractMediator mediator;

    private OrganismState partnerState;

    public AbstractPartner(AbstractMediator mediator, OrganismState state) {
        this.mediator = mediator;
        this.partnerState = state;
        state.addObserver(this);
    }

    public abstract void attack();

    public abstract void setOrganismState();


}
