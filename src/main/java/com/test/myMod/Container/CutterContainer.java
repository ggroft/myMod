package com.test.myMod.Container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import com.test.myMod.Entity.GemCutterEntity;


public class CutterContainer extends Container {



protected GemCutterEntity tileEntity;

    public CutterContainer(InventoryPlayer inventoryPlayer, GemCutterEntity te) {
        tileEntity = te;



           // input slots
            for(int j = 0; j < 3; j++) {            // slot index     x pos       y pos
                addSlotToContainer(new Slot(tileEntity, j, 53 + j * 18, -11));

        }
        // liquid input
        for(int j = 0; j < 1; j++) {            // slot index     x pos       y pos
            addSlotToContainer(new Slot(tileEntity, j, 120 + j * 18, -6));

        }
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(tileEntity, 9+j+i*9, 8 + j * 18, 63 + i * 18));
            }
        }




        bindPlayerInventory(inventoryPlayer);
    }

    @Override
    public boolean canInteractWith(EntityPlayer var1) {
        return false;
    }

    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 110 + i * 18));
            }
        }

        for(int i = 0; i < 9; i++) {
            addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 168));
        }
    }

    //For shift-clicking, without this, it would cause massive errors
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
        ItemStack stack = null;
        Slot slotObject = (Slot) inventorySlots.get(slot);

        //null checks and checks if the item can be stacked (maxStackSize > 1)
        if(slotObject != null && slotObject.getHasStack()) {
            ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();

            //Merges the item into player inventory since its in the tileEntity
            if(slot < 9) {
                if(!this.mergeItemStack(stackInSlot, 0, 35, true)) {
                    return null;

                }

                //places it into the tileEntity is possible since its in the player inventory
            } else if(!this.mergeItemStack(stackInSlot, 0, 3, false)) {
                return null;

            }

            if(stackInSlot.stackSize == 0) {
                slotObject.putStack(null);

            } else {
                slotObject.onSlotChanged();

            }

            if(stackInSlot.stackSize == stack.stackSize) {
                return null;
            }

            slotObject.onPickupFromSlot(player, stackInSlot);
        }

        return stack;
    }
}