package com.test.myMod.handler;

import com.test.myMod.Container.CutterContainer;
import com.test.myMod.Entity.GemCutterEntity;
import com.test.myMod.client.gui.CutterGuiContainer;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
    public enum GUIs {
        gemCUTTER
    }

        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            if(tileEntity instanceof GemCutterEntity) {

                if(ID == GUIs.gemCUTTER.ordinal()) return new CutterContainer(player.inventory, (GemCutterEntity) tileEntity);
                else return null;
            }

            return null;
        }


        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            if(tileEntity instanceof GemCutterEntity) {
                return new CutterGuiContainer(player.inventory, (GemCutterEntity) tileEntity);

            }
            return null;
        }
}


/* eredeti

{
    public enum GUIs {
        gemCUTTER
    }
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
     //   if(ID == GUIs.gemCUTTER.ordinal()) return new GuiCutter(player, world, x, y, z);
        if(ID == GUIs.gemCUTTER.ordinal()) return new CutterGuiContainer(player.inventory, (GemCutterEntity) tileEntity);
        else return null;
    }
}
*/