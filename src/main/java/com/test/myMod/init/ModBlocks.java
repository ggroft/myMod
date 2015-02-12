package com.test.myMod.init;


import com.test.myMod.block.*;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{

    public static Block Amethyst_Ore;
    public static Block Ametrine_Ore;
    public static Block Aquamarine_Ore;
    public static Block Bloodstone_Ore;
    public static Block Chrysocolla_Ore;
    public static Block Citrine_Ore;
    public static Block Malachite_Ore;
    public static Block Moonstone_Ore;
    public static Block Opal_Ore;
    public static Block Rhodonite_Ore;
    public static Block Rose_Quartz_Ore;
    public static Block Seraphinite_Ore;
    public static Block Tanzanite_Ore;
    public static Block GemCutter;
    public static void init()

    {
        GameRegistry.registerBlock(Amethyst_Ore = new Amethyst_Ore(Names.Blocks.AMETHYST_ORE, Material.rock, ModItems.Raw_Amethyst, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.AMETHYST_ORE);
        GameRegistry.registerBlock(Ametrine_Ore = new Ametrine_Ore(Names.Blocks.AMETRINE_ORE, Material.rock, ModItems.Raw_Ametrine, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.AMETRINE_ORE);
        GameRegistry.registerBlock(Aquamarine_Ore = new Aquamarine_Ore(Names.Blocks.AQUAMARINE_ORE, Material.rock, ModItems.Raw_Aquamarine, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.AQUAMARINE_ORE);
        GameRegistry.registerBlock(Bloodstone_Ore = new Bloodstone_Ore(Names.Blocks.BLOODSTONE_ORE, Material.rock, ModItems.Raw_Bloodstone, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.BLOODSTONE_ORE);
        GameRegistry.registerBlock(Chrysocolla_Ore = new Chrysocolla_Ore(Names.Blocks.CHRYSOCOLLA_ORE, Material.rock, ModItems.Raw_Chrysocolla, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.CHRYSOCOLLA_ORE);
        GameRegistry.registerBlock(Citrine_Ore = new Citrine_Ore(Names.Blocks.CITRINE_ORE, Material.rock, ModItems.Raw_Citrine, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.CITRINE_ORE);
        GameRegistry.registerBlock(Malachite_Ore = new Malachite_Ore(Names.Blocks.MALACHITE_ORE, Material.rock, ModItems.Raw_Malachite, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.MALACHITE_ORE);
        GameRegistry.registerBlock(Moonstone_Ore = new Moonstone_Ore(Names.Blocks.MOONSTONE_ORE, Material.rock, ModItems.Raw_Moonstone, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.MOONSTONE_ORE);
        GameRegistry.registerBlock(Opal_Ore = new Opal_Ore(Names.Blocks.OPAL_ORE, Material.rock, ModItems.Raw_Opal, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.OPAL_ORE);
        GameRegistry.registerBlock(Rhodonite_Ore = new Rhodonite_Ore(Names.Blocks.RHODONITE_ORE, Material.rock, ModItems.Raw_Rhodonite, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.RHODONITE_ORE);
        GameRegistry.registerBlock(Rose_Quartz_Ore = new Rose_Quartz_Ore(Names.Blocks.ROSE_QUARTZ_ORE, Material.rock, ModItems.Raw_Rose_Quartz, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.ROSE_QUARTZ_ORE);
        GameRegistry.registerBlock(Seraphinite_Ore = new Seraphinite_Ore(Names.Blocks.SERAPHINITE_ORE, Material.rock, ModItems.Raw_Seraphinite, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.SERAPHINITE_ORE);
        GameRegistry.registerBlock(Tanzanite_Ore = new Tanzanite_Ore(Names.Blocks.TANZANITE_ORE, Material.rock, ModItems.Raw_Tanzanite, 2, 4).setHardness(10.0f).setResistance(20.0f), Names.Blocks.TANZANITE_ORE);
        GameRegistry.registerBlock(GemCutter = new GemCutterBlock(Names.Blocks.GEM_CUTTER, Material.rock, ModBlocks.GemCutter,1).setHardness(10.0f).setResistance(20.0f), Names.Blocks.GEM_CUTTER);
       

    }
}
