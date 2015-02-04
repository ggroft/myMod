package com.test.myMod.init;


import com.test.myMod.block.BlockBone;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModeBlocks
{
    public static final com.test.myMod.block.BlockBone BlockBone = new BlockBone();

    public static void init()
    {
        GameRegistry.registerBlock(BlockBone, Names.Blocks.BONE_BLOCK);
    }
}
