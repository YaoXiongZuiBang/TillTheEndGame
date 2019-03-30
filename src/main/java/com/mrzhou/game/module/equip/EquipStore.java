package com.mrzhou.game.module.equip;

import java.util.ArrayList;
import java.util.List;

public class EquipStore {
    private List<Equip> equipList;
    public EquipStore(){
        equipList = new ArrayList<>();
        equipList.add(new BalanceStoneEquip());
        equipList.add(new BloodMapEquip());
        equipList.add(new BloodStoneEquip());
        equipList.add(new EnergyMapEquip());
        equipList.add(new FightMapEquip());
        equipList.add(new GuideMapEquip());
        equipList.add(new HolyCrossEquip());
        equipList.add(new MagicStoneEquip());
        equipList.add(new NatureStoneEquip());
        equipList.add(new ProtectedBookEquip());
        equipList.add(new StrengthBookEquip());
        equipList.add(new WisdomBookEquip());
    }
}
