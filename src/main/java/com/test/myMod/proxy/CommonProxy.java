package com.test.myMod.proxy;


import com.test.myMod.Container.CutterContainer;
import com.test.myMod.Entity.GemCutterEntity;
import com.test.myMod.block.GemCutterBlock;
import com.test.myMod.init.ModBlocks;
import com.test.myMod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class CommonProxy implements IProxy
{
   // public static Block cutterContainer = new GemCutterBlock(com.test.myMod.reference.Names.Blocks.GEM_CUTTER, Material.rock, ModBlocks.GemCutter,1).setHardness(10.0f).setResistance(20.0f), Names.Blocks.GEM_CUTTER);
    public void registerTileEntities() {

        GameRegistry.registerTileEntity(GemCutterEntity.class, "cutterContainer");
    }

}
