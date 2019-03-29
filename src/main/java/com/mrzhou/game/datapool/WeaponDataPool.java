package com.mrzhou.game.datapool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mrzhou.game.module.weapon.WeaponFactory;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.util.FileUtil;

import java.util.Hashtable;
import java.util.Map;

/**
 * 类说明：武器类数据池
 * 创建者：Zeros
 * 创建时间：2019-03-21 00:14
 * 包名：com.mrzhou.game.datapool
 */

public class WeaponDataPool extends DataPool{

    private static final String NAME_KEY = "name";
    private static final String TYPE_KEY = "type";
    private Map<String, Map<Integer, JSONObject>> weaponPool;

    private WeaponDataPool(){
        weaponPool = new Hashtable<>();
        loadFile();
    }

    private static final class SingletonWeaponDataPool{
        private static WeaponDataPool pool = new WeaponDataPool();

    }

    public static WeaponDataPool getInstance(){
        return SingletonWeaponDataPool.pool;
    }


    @Override
    public <T> T getData(String type, Integer level, Class<T> tClass) {
        if(weaponPool.containsKey(type)) {
            Map<Integer, JSONObject> levels = weaponPool.get(type);
            if(levels.containsKey(level)){
                JSONObject levelJson = levels.get(level);
                return (T) WeaponFactory.parseWeapon(type, levelJson.toJSONString());
            }
        }
        return null;
    }

    private void loadFile(){
        JSONObject object = JSON.parseObject(FileUtil.readFile(ConstantsUtil.WEAPON_INFO_PATH));
        object.entrySet().forEach(a ->{
            Map<Integer, JSONObject> map = new Hashtable<>();
            JSONObject weaponJson = (JSONObject) a.getValue();
            JSONObject levels = weaponJson.getJSONObject(ConstantsUtil.LEVELS_KEY);
            weaponJson.remove(ConstantsUtil.LEVELS_KEY);

            levels.entrySet().forEach(b -> {
                JSONObject levelJson = (JSONObject) b.getValue();
                levelJson.put(ConstantsUtil.LEVEL_KEY, b.getKey());
                levelJson.put(NAME_KEY, weaponJson.getString(NAME_KEY));
                levelJson.put(TYPE_KEY, a.getKey());
                map.put(Integer.parseInt(b.getKey()), levelJson);
            });
            weaponPool.put(a.getKey(), map);
        });
    }


//    public static void main(String[] args) {
//        DataPool dataPool = DataPoolFactory.createDataPool(ConstantsUtil.WEAPON_PART);
//        Weapon t = dataPool.getData("dagger", 2, Weapon.class);
//        System.out.println(t);
//    }

}
