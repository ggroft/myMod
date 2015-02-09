package com.test.myMod.init;


import com.test.myMod.Entity.GemCutterEntity;
import com.test.myMod.block.BlockBone;
import com.test.myMod.block.GemCutterBlock;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{

    public static Block BlockBone;
    public static Block GemCutter;
    public static void init()

    {
        GameRegistry.registerBlock(BlockBone = new BlockBone(Names.Blocks.BONE_BLOCK, Material.rock, ModItems.BoneFragment, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.BONE_BLOCK);


       GameRegistry.registerBlock(GemCutter = new GemCutterBlock(Names.Blocks.GEM_CUTTER, Material.rock, ModBlocks.GemCutter,1).setHardness(10.0f).setResistance(20.0f), Names.Blocks.GEM_CUTTER);
       

    }
}
