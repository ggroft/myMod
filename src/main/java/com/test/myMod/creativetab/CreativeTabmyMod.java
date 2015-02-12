package com.test.myMod.creativetab;


import com.test.myMod.init.ModItems;
import com.test.myMod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabmyMod
{
    public static final CreativeTabs myMod_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem()
        {
            return ModItems.Raw_Amethyst;
        }


    };
}
