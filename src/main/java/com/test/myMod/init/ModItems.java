package com.test.myMod.init;


import com.test.myMod.item.*;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //public static final ItemBoneSword BoneSword = new ItemBoneSword(Material.Tools.BONE_MATTER);
    public static final Raw_Amethyst RawAmethyst = new Raw_Amethyst();
    public static final Raw_Ametrine RawAmetrine = new Raw_Ametrine();
    public static final Raw_Aquamarine RawAquamarine = new Raw_Aquamarine();
    public static final Raw_Bloodstone RawBloodstone= new Raw_Bloodstone();
    public static final Raw_Chrysocolla RawChrysocolla= new Raw_Chrysocolla();
    public static final Raw_Citrine RawCitrine= new Raw_Citrine();
    public static final Raw_Malachite RawMalachite= new Raw_Malachite();
    public static final Raw_Moonstone RawMoonstone= new Raw_Moonstone();
    public static final Raw_Opal RawOpal= new Raw_Opal();
    public static final Raw_Rhodonite RawRhodonite= new Raw_Rhodonite();
    public static final Raw_Rose_Quartz RawRose_Quartz= new Raw_Rose_Quartz();
    public static final Raw_Seraphinite RawSeraphinite= new Raw_Seraphinite();
    public static final Raw_Tanzanite RawTanzanite= new Raw_Tanzanite();

    public static void init()
    {
       // GameRegistry.registerItem(BoneSword, Names.Items.BONE_SWORD);
        GameRegistry.registerItem(RawAmethyst, Names.Items.RAW_AMETHYST);
        GameRegistry.registerItem(RawAmetrine, Names.Items.RAW_AMETRINE);
        GameRegistry.registerItem(RawAquamarine, Names.Items.RAW_AQUAMARINE);
        GameRegistry.registerItem(RawBloodstone, Names.Items.RAW_BLOODSTONE);
        GameRegistry.registerItem(RawChrysocolla, Names.Items.RAW_CHRYSOCOLLA);
        GameRegistry.registerItem(RawCitrine, Names.Items.RAW_CITRINE);
        GameRegistry.registerItem(RawMalachite, Names.Items.RAW_MALACHITE);
        GameRegistry.registerItem(RawMoonstone, Names.Items.RAW_MOONSTONE);
        GameRegistry.registerItem(RawOpal, Names.Items.RAW_OPAL);
        GameRegistry.registerItem(RawRhodonite, Names.Items.RAW_RHODONITE);
        GameRegistry.registerItem(RawRose_Quartz, Names.Items.RAW_ROSE_QUARTZ);
        GameRegistry.registerItem(RawSeraphinite, Names.Items.RAW_SERAPHINITE);
        GameRegistry.registerItem(RawTanzanite, Names.Items.RAW_TANZANITE);
    }
}

