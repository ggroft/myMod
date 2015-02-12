package com.test.myMod.block;

//http://bedrockminer.jimdo.com/modding-tutorials/basic-modding/language-file/

import com.test.myMod.creativetab.CreativeTabmyMod;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class Bloodstone_Ore extends Block {
    private Item drop;
    private int meta;
    private int least_quantity;
    private int most_quantity;


    public Bloodstone_Ore(String unlocalizedName, Material mat, Item drop, int meta, int least_quantity, int most_quantity) {
        super(mat);
        this.drop = drop;
        this.meta = meta;
        this.least_quantity = least_quantity;
        this.most_quantity = most_quantity;
        this.blockHardness = 20;
        this.setBlockName(Names.Blocks.BLOODSTONE_ORE);
        this.setCreativeTab(CreativeTabmyMod.myMod_TAB);
    }
    public Bloodstone_Ore(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
        this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
    }
    public Bloodstone_Ore(String unlocalizedName, Material mat, Item drop) {
        this(unlocalizedName, mat, drop, 1, 1);
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return this.drop;
    }
    @Override
    public int damageDropped(int meta) {
        return meta;
    }
    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        if (this.least_quantity >= this.most_quantity)
            return this.least_quantity;
        return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
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