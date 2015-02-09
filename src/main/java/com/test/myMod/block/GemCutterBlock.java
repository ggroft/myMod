package com.test.myMod.block;




import com.test.myMod.Entity.GemCutterEntity;
import com.test.myMod.creativetab.CreativeTabmyMod;
import com.test.myMod.handler.GuiHandler;
import com.test.myMod.myMod;
import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class GemCutterBlock extends BlockContainer implements ITileEntityProvider {
    private Block drop;
    private int meta;
    private int quantity;



    public GemCutterBlock(String unlocalizedName, Material mat, Block drop, int meta, int quantity) {
        super(mat);
        this.drop = drop;
        this.meta = meta;
        this.quantity = quantity;
        this.blockHardness = 20;
        this.setBlockName(Names.Blocks.GEM_CUTTER);
        this.setCreativeTab(CreativeTabmyMod.myMod_TAB);
    }
    public GemCutterBlock(String unlocalizedName, Material mat, Block drop, int quantity) {
        this(unlocalizedName, mat, drop, 0, quantity);
    }
    public GemCutterBlock(String unlocalizedName, Material mat, Block drop) {
        this(unlocalizedName, mat, drop, 1, 1);
    }

    public Block getBlockDropped(int meta) {
        return this.drop;
    }
    @Override
    public int damageDropped(int meta) {
        return meta;
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


    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new GemCutterEntity();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(myMod.instance , GuiHandler.GUIs.gemCUTTER.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }





}
