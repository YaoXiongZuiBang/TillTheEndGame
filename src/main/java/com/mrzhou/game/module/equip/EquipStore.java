package com.mrzhou.game.module.equip;

import java.util.ArrayList;
import java.util.List;

public class EquipStore {
    private List<Equip> equipList;
    public EquipStore(){
        equipList = new ArrayList<>();
        equipList.add(new BalanceStoneEquip());
        equipList.add(new BloodMapEquip());
    }
}
