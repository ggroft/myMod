package com.test.myMod.init;


import com.test.myMod.item.ItemBoneSword;
import com.test.myMod.item.ItemmyMod;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemmyMod BoneSword = new ItemBoneSword();

    public static void init()
    {
        GameRegistry.registerItem(BoneSword, Names.Items.BONE_SWORD);
    }
}

