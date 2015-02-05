package com.test.myMod.init;


import com.test.myMod.WorldGen.BoneGeneration;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreGen {

    public static void init()
    {
        GameRegistry.registerWorldGenerator(new BoneGeneration(),0);
    }

}
