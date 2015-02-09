package com.test.myMod.client.gui;


import com.test.myMod.Container.CutterContainer;
import com.test.myMod.Entity.GemCutterEntity;
import com.test.myMod.reference.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class CutterGuiContainer extends GuiContainer {

    private int xSize, ySize;



    public CutterGuiContainer(InventoryPlayer inventoryPlayer, GemCutterEntity tileEntity) {
        super(new CutterContainer(inventoryPlayer, tileEntity));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) { //Draw text and stuff here
        xSize = 176;
        ySize = 218;
        fontRendererObj.drawString("Basic", 8, 6, 4210752); //params are string, x, y, color
        fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752); //draws "Inventory

    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        xSize = 176;
        ySize = 218;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID.toLowerCase() + ":" + "textures/gui/GuiCutter.png"));
        int x = (this.width - this.xSize) /2;
        int y = (this.height - this.ySize) /2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }


}
/*
Check if the mouse is over the bar.
        mouseX >= energybarX && mouseX <= energybarX + energybarWidth && mouseY >= energybarY && mouseY <= energybarY + energybarHeight
        Then draw your tooltip
*/