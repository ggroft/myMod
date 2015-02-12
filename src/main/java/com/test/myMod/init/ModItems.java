package com.test.myMod.init;


import com.test.myMod.item.*;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //public static final ItemBoneSword BoneSword = new ItemBoneSword(Material.Tools.BONE_MATTER);
    public static final Raw_Amethyst Raw_Amethyst = new Raw_Amethyst();
    public static final Raw_Ametrine Raw_Ametrine = new Raw_Ametrine();
    public static final Raw_Aquamarine Raw_Aquamarine = new Raw_Aquamarine();
    public static final Raw_Bloodstone Raw_Bloodstone= new Raw_Bloodstone();
    public static final Raw_Chrysocolla Raw_Chrysocolla= new Raw_Chrysocolla();
    public static final Raw_Citrine Raw_Citrine= new Raw_Citrine();
    public static final Raw_Malachite Raw_Malachite= new Raw_Malachite();
    public static final Raw_Moonstone Raw_Moonstone= new Raw_Moonstone();
    public static final Raw_Opal Raw_Opal= new Raw_Opal();
    public static final Raw_Rhodonite Raw_Rhodonite= new Raw_Rhodonite();
    public static final Raw_Rose_Quartz Raw_Rose_Quartz= new Raw_Rose_Quartz();
    public static final Raw_Seraphinite Raw_Seraphinite= new Raw_Seraphinite();
    public static final Raw_Tanzanite Raw_Tanzanite= new Raw_Tanzanite();

    public static void init()
    {
       // GameRegistry.registerItem(BoneSword, Names.Items.BONE_SWORD);
        GameRegistry.registerItem(Raw_Amethyst, Names.Items.RAW_AMETHYST);
        GameRegistry.registerItem(Raw_Ametrine, Names.Items.RAW_AMETRINE);
        GameRegistry.registerItem(Raw_Aquamarine, Names.Items.RAW_AQUAMARINE);
        GameRegistry.registerItem(Raw_Bloodstone, Names.Items.RAW_BLOODSTONE);
        GameRegistry.registerItem(Raw_Chrysocolla, Names.Items.RAW_CHRYSOCOLLA);
        GameRegistry.registerItem(Raw_Citrine, Names.Items.RAW_CITRINE);
        GameRegistry.registerItem(Raw_Malachite, Names.Items.RAW_MALACHITE);
        GameRegistry.registerItem(Raw_Moonstone, Names.Items.RAW_MOONSTONE);
        GameRegistry.registerItem(Raw_Opal, Names.Items.RAW_OPAL);
        GameRegistry.registerItem(Raw_Rhodonite, Names.Items.RAW_RHODONITE);
        GameRegistry.registerItem(Raw_Rose_Quartz, Names.Items.RAW_ROSE_QUARTZ);
        GameRegistry.registerItem(Raw_Seraphinite, Names.Items.RAW_SERAPHINITE);
        GameRegistry.registerItem(Raw_Tanzanite, Names.Items.RAW_TANZANITE);
    }
}

