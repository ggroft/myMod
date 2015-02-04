package com.test.myMod.block;


import com.test.myMod.creativetab.CreativeTabmyMod;
import com.test.myMod.init.ModItems;
import com.test.myMod.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class BlockBone extends Block
{
    public BlockBone(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabmyMod.myMod_TAB);
        this.setBlockName("boneBlock");
        this.setBlockTextureName("boneBlock");
        this.setHarvestLevel("pickaxe",0);

    }

    public BlockBone()
    {
        this(Material.rock);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par2)
    {
       // return new ItemStack(Item.getItemById(351), 1, 4) ;

        return Item.getItemById(351);
    }
    @Override
    public int quantityDropped(Random random)
    {
        return (random.nextInt(4) + 1);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
