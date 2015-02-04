package com.test.myMod.init;


import com.test.myMod.item.ItemBone;
import com.test.myMod.item.ItemBoneSword;
import com.test.myMod.reference.Material;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBoneSword BoneSword = new ItemBoneSword(Material.Tools.BONE_MATTER);
    public static final ItemBone BoneFragment = new ItemBone();

    public static void init()
    {
        GameRegistry.registerItem(BoneSword, Names.Items.BONE_SWORD);
        GameRegistry.registerItem(BoneFragment, Names.Items.BONE_FRAGMENT);
    }
}

