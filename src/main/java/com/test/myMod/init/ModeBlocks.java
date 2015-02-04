package com.test.myMod.init;


import com.test.myMod.block.BlockBone;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModeBlocks
{

    public static Block BlockBone;
    public static void init()

    {
        GameRegistry.registerBlock(BlockBone = new BlockBone(Names.Blocks.BONE_BLOCK, Material.rock, ModItems.BoneFragment, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.BONE_BLOCK);

    }
}
