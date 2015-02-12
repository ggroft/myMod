package com.test.myMod.init;


import com.test.myMod.WorldGen.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreGen {

    public static void init()
    {
        GameRegistry.registerWorldGenerator(new AmethystGen(),0);
        GameRegistry.registerWorldGenerator(new AmetrineGen(),0);
        GameRegistry.registerWorldGenerator(new AquamarineGen(),0);
        GameRegistry.registerWorldGenerator(new BloodstoneGen(),0);
        GameRegistry.registerWorldGenerator(new ChrysocollaGen(),0);
        GameRegistry.registerWorldGenerator(new CitrineGen(),0);
        GameRegistry.registerWorldGenerator(new MalachiteGen(),0);
        GameRegistry.registerWorldGenerator(new MoonstoneGen(),0);
        GameRegistry.registerWorldGenerator(new OpalGen(),0);
        GameRegistry.registerWorldGenerator(new RhodoniteGen(),0);
        GameRegistry.registerWorldGenerator(new Rose_QuartzGen(),0);
        GameRegistry.registerWorldGenerator(new SeraphiniteGen(),0);
        GameRegistry.registerWorldGenerator(new TanzaniteGen(),0);
    }

}
