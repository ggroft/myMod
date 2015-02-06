package com.test.myMod.init;

import com.test.myMod.WorldGen.HutGeneration;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class HutGen implements IWorldGenerator {
    HutGeneration gen = new HutGeneration();


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        chunkX = chunkX * 16;
        chunkZ = chunkZ * 16;
        if(world.provider.dimensionId==-1)gen.generateNether(world, random, chunkX, chunkZ);
        if(world.provider.dimensionId==0)gen.generateSurface(world, random, chunkX, chunkZ);


    }

    public static void init() {

        GameRegistry.registerWorldGenerator(new HutGen(), 1);



    }






}