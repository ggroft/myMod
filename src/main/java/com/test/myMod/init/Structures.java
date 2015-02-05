package com.test.myMod.init;



import com.test.myMod.WorldGen.Epulet;
import com.test.myMod.WorldGen.testEpulet;
import com.test.myMod.creativetab.CreativeTabmyMod;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Structures

{
    public static Block genEpulet;

    public static void init()
    {

    genEpulet = new Epulet(Material.rock).setCreativeTab(CreativeTabmyMod.myMod_TAB).setBlockName("thisCanBeAnything").setBlockTextureName(Reference.MOD_ID + ":" + "blockInstantStructure.png");

    GameRegistry.registerBlock(genEpulet, "Epuletecske_kene_legyen");
   // GameRegistry.registerWorldGenerator(eventmanager);
}

}
