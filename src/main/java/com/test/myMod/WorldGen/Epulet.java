package com.test.myMod.WorldGen;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Epulet extends Block
{
    Blocks b;

    public Epulet(Material material)
    {
        super(material);
    }

    public void onBlockPlacedBy(World world, Random random, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
    {
//Super
        super.onBlockPlacedBy(world, x, y, z, entity, itemstack);

//Sets the block to air on the x, y, and z coords from where you placed the block
        world.setBlockToAir(x, y, z);

//Sets the block on the x, y, and z coords starting from where you placed the block
        world.setBlock(x, y, z, b.cobblestone);
        world.setBlock(x, y+1, z, b.cobblestone);
        world.setBlock(x, y+1, z, b.cobblestone);
        world.setBlock(x, y+1, z, b.cobblestone);
//Sets the block(with set metadata) on the x, y, and z coords from where you placed the block
        world.setBlock(x, y, z, b.planks, 2, 2); //This is for birch planks, if you want other planks, search 'Minecraft Block Metadata' in google or find it on the MinecraftWiki
    }
}