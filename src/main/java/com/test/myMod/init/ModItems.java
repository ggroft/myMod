package com.test.myMod.init;


import com.test.myMod.item.ItemBoneSword;
import com.test.myMod.item.ItemmyMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemmyMod bonesword = new ItemBoneSword();

    public static void init()
    {
        GameRegistry.registerItem(bonesword, "BoneSword");
    }
}
