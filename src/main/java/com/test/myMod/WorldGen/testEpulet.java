package com.test.myMod.WorldGen;



import java.util.Random;



import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class testEpulet extends WorldGenerator
{
    Blocks b;
    public boolean generate(World par1World, Random par2Random, int x, int y, int z)
    {
        while (par1World.isAirBlock(x, y, z) && y > 2)
        {
            y--;
        }

        par1World.setBlock(x, y, z, b.diamond_block);
        par1World.setBlock(x+1, y, z, b.diamond_block);
        par1World.setBlock(x-1, y, z, b.diamond_block);
        par1World.setBlock(x, y, z+1, b.diamond_block);
        par1World.setBlock(x, y, z-1, b.diamond_block);
        par1World.setBlock(x+1, y, z+1, b.stonebrick);
        par1World.setBlock(x+1, y, z-1, b.stonebrick);
        par1World.setBlock(x-1, y, z-1, b.stonebrick);
        par1World.setBlock(x-1, y, z+1, b.stonebrick);
       // par1World.setBlockAndMetadata(x, y – 1, z, b.stonebrick, 1);

        return true;
    }
}
//- See more at: http://www.wuppy29.com/minecraft/modding-tutorials/modding-custom-structure-generation/#sthash.M2LETqyT.dpuf