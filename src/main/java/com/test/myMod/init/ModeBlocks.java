package com.test.myMod.init;


import com.test.myMod.block.BlockBone;
import com.test.myMod.block.BlockmyMod;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModeBlocks
{
    public static final BlockmyMod blockBone = new BlockBone();

    public static void init()
    {
        GameRegistry.registerBlock(blockBone, "BlockBone");
    }
}