package com.mrzhou.game.module.equip;

public class GuideMapEquip extends  Equip{

    public GuideMapEquip(){
        init();
        this.name = "指引之图";
        this.img = "/img/equipment/equip_1.png";
    }

    @Override
    public void initBuffs() {
        Buff defenceBuff = new DefenceBuff();
        defenceBuff.setStrength(new HighStrength());
        buffList.add(defenceBuff);
    }

}
